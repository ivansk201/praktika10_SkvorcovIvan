fun main()
{
    print("Введите стоимость минут у оператора: ")
    var chena= readLine()!!.toDouble()
    print("Введите площадь покрытия: ")
    var plosh= readLine()!!.toDouble()
    if(chena>0 && plosh>0)
    {
        var megafon=Megafon("Megafon",chena,plosh,true)
        println(megafon.Info())
    }
    else
    {
        println("Ошибка, введены неверные значения")
    }
    print("Введите стоимость минут у оператора: ")
    var chena2= readLine()!!.toDouble()
    print("Введите площадь покрытия: ")
    var plosh2= readLine()!!.toDouble()
    if (chena2>0 && plosh2>0)
    {
        var Yota=Yota("YOTA",chena2,plosh2,false)
        println(Yota.info())
    }
    else println("Ошибка, введены неверные значения")
}