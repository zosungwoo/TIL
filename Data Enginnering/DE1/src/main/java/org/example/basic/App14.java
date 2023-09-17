package org.example.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App14 {
    ArrayList arrayList = new ArrayList();
    List list = arrayList;
    Collection collection = arrayList;
    // 상속관계로 인해 가능
}
