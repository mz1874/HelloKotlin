/**
 * @author aiden
 * @data 20/03/2024
 * @description
 */
class VariableDeclaration {

    /* bu using this annotation to ignore the warning   */
    @ExperimentalUnsignedTypes
    fun variableDefine()
    {
        //32
        var number : Int;
        //16 Unicode
        var dataToReceive: Char;
        //8
        var dataToSend: Byte;
        //16
        var halfWord: Short;
        //Class
        var Name: String;
        //1
        var isTure: Boolean;
        var price: Float;
        //64
        var high: Double;
        //32
        var mater : Int;
        //64
        var age : Long;

        //32 bits
        var UNumber : UInt;
        //8 bits
        var UdataToSend: UByte;
        //16 bits
        var UhalfWord: UShort;
        //64
        var Uage : ULong;

    }
}