import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

const apiKey = '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';
const apiUrl = 'https://api.openai.com/v1/completions';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: FirstPage(),
    );
  }
}

class FirstPage extends StatefulWidget {
  const FirstPage({Key? key}) : super(key: key);

  @override
  State<FirstPage> createState() => _FirstPageState();
}

class _FirstPageState extends State<FirstPage> {
  final TextEditingController _controller = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("EG: English with GPT"),
      ),
      body: Column(
        children: [
          TextField(
            controller: _controller,
            maxLines: null,
          ),
          const SizedBox(height: 16),
          TextButton(
            onPressed: () {
              setState(() {
                _controller.text += '\nWhat does the above sentence mean?';  // 해당 문장의 의미를 묻는 프롬프트 추가
              });
            },
            child: const Text('Meaning'),
          ),
          const SizedBox(height: 16),
          TextButton(
            onPressed: () {
              setState(() {
                _controller.text += '\nIs the above sentence correct and natural?';  // 해당 문장이 올바르고 자연스러운지 묻는 프롬프트 추가
              });
            },
            child: const Text('Correct & Natural'),
          ),
          const SizedBox(height: 32),
          ElevatedButton(
            onPressed: () {
              String prompt = _controller.text;
              Navigator.of(context).push(MaterialPageRoute(
                  builder: (context) => ResultPage(prompt)));  // "Get Result" 버튼을 누르면 ResultPage로 이동
            },
            child: const Text("Get Result"),
          )
        ],
      ),
    );
  }
}

class ResultPage extends StatefulWidget {
  final String prompt;
  const ResultPage(this.prompt, {super.key});

  @override
  State<ResultPage> createState() => _ResultPageState();
}

class _ResultPageState extends State<ResultPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Result from GPT"),
      ),
      body: FutureBuilder<String>(
        future: generateText(widget.prompt),  // GPT에 결과를 요청하기 위해 generateText 함수 호출
        builder: (context, snapshot) {
          if (snapshot.connectionState == ConnectionState.waiting) {
            return const Center(child: CircularProgressIndicator());  // API 응답을 기다리는 동안 로딩 표시
          } else if (snapshot.hasError) {
            return Text('Error: ${snapshot.error}');
          } else {
            return Text('${snapshot.data}');  // 받아온 텍스트 표시
          }
        },
      ),
    );
  }
}

Future<String> generateText(String prompt) async {
  final response = await http.post(
    Uri.parse(apiUrl),
    headers: {'Content-Type': 'application/json','Authorization': 'Bearer $apiKey'},
    body: jsonEncode({
      "model": "text-davinci-003",
      'prompt': prompt,
      'max_tokens': 1000,
      'temperature': 0,
      'top_p': 1,
      'frequency_penalty': 0,
      'presence_penalty': 0
    }),
  );

  Map<String, dynamic> newresponse = jsonDecode(utf8.decode(response.bodyBytes));

  return newresponse['choices'][0]['text'];  // API 응답에서 받아온 텍스트를 추출하여 반환
}