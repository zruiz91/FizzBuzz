class FizzBuzz {

    public static void main(String[] args) {

        // for loop that goes to 100
        for (int i = 1; i <= 100; i++) {
            //if divisible by 3 and 5 output FizzBuzz
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //if divisible by 3 output Fizz
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            //if divisible by 5 output Buzz
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            //if none of the above print i
            else {
                System.out.println(i);
            }

        }
    }

}