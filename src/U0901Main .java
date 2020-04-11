class U0901Main  {
    public static void main(String[] args) {

        Integer intArr[] = {10,20,15};

        Float floatArr[] = new Float[5];
        for(int i = 0; i < 5; i++){
            floatArr[i] = Float.valueOf(i * 7 / 3);
        }

        U0901WorkArray insWorkArrayInt = new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat = new U0901WorkArray(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());

        //CHECKING WITH ARRAY OF STRINGS:
        /*String strArr[] = {"T", "h", "g"};
        U0901WorkArray insWorkArrayStr = new U0901WorkArray(strArr);
        System.out.println(insWorkArrayStr.sum());*/
    }
}