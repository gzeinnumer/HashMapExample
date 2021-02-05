# HashMapExample
 
```java
HashMap<Object , String> map = new HashMap<>();

String str = "strv";
map.put(str, str);
Log.d(TAG, "onCreate: "+ map.get(str)); //onCreate: strv

TextView textView = findViewById(R.id.tv);
map.put(textView, textView.getText().toString());
Log.d(TAG, "onCreate: "+ map.get(textView)); //onCreate: Hello World!

DummyClass dummyClass = new DummyClass();
map.put(dummyClass.variable, dummyClass.variable);
Log.d(TAG, "onCreate: "+ map.get(dummyClass.variable)); //onCreate: data_dummyclass
```

---

```
Copyright 2021 M. Fadli Zein
```