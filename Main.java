class Main {
  public static void main(String[] args) {
    // recursion is calling a method within its self
    int result = app(5);
    System.out.println(result);
  }

  public static int app(int num) {
    if (num > 0) {
      return num + app(num - 1);
      // 5 + app(4)
      // 4 + app(3)
      // 3 + app(2)
      // 2 + app(1)
      // 1 + app(0)
    } else {
      return 0;
    }
  }
}