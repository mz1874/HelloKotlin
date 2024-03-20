/**
 * @author aiden
 * @data 20/03/2024
 * @description
 */
class Variable {

    var number = 99;

    val price = 999;

    fun changeNumber()
    {
        number +=1;
        /*  we can find that if you want to change a constant the compiler will warn that if change the val to var  */
        //price +=1;
    }

    fun printNumber()
    {
        println("The number is $number");
        println("The price is $price");
        println("Now I going to change the two variables ");
        changeNumber();
        println("The number has been changed to $number");
    }
}