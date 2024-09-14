void main() {
  print("hello world");

//Variables
  var name = "Ujju";
  print(name);

//Data type

  int age = 18; //int
  print(age);

  String fullname = "ujjwal singh"; //String
  print(fullname);

  double marks = 70; //Double
  print(marks); //Output 70.0

  int num1 = 17; //Booleans
  int num2 = 1;
  bool values = (num1 == num2);
  print(values);

  var fname = "ujju";
  print(fname.runtimeType); //type String
  var sage = 18;
  print(sage.runtimeType); //type int
  var smakrs = 70.0;
  print(smakrs.runtimeType); //type Double

  // Looping
  for (int i = 1; i <= 10; i++) {
    print("hellow world");
  }

  //for in
  var Student_marks = [90, 8, 66, 46, 57];
  for (var i in Student_marks) {
    print(i);
  }
}
