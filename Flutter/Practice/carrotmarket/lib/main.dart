import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
          appBar: AppBar(
              title: Text("구로3동", style: TextStyle(color: Colors.black, fontWeight: FontWeight.bold),),
              actions: [
                Icon(Icons.search, color: Colors.black),
                Icon(Icons.menu, color: Colors.black),
                Icon(Icons.notifications, color: Colors.black)
              ],
              backgroundColor: Colors.white
          ),
          body: Column(
            children: [
              Container(
                color: Color(0xFFF1F1F1),
                width: double.infinity,
                height: 160,
                margin: EdgeInsets.all(0),
                child: Row(
                  children: [
                    Image.asset("assets/fp30x.webp"),
                    Container(
                      margin: EdgeInsets.all(10),
                      width: 230,
                      child: Column(
                        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text("Roland FP-30X 풀구성 판매합니다", style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),),
                          Text("구로구 구로3동, 35분 전"),
                          Text("800,000원", style: TextStyle(fontWeight: FontWeight.bold)),
                          Row(
                            mainAxisAlignment: MainAxisAlignment.end,
                            children: [
                              Icon(Icons.favorite),
                              Text("7")
                            ],
                          )
                        ],
                      ),
                    )
                  ],
                ),
              ),
            ],
          ),
          bottomNavigationBar: BottomAppBar(),

        )
    );
  }
}
