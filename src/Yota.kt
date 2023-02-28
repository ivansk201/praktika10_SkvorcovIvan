class Yota(name:String, chena:Double, plosh:Double, public var P:Boolean):Operator(name, chena, plosh)
{
    override fun Q():Double {
        if (P == true)
            return 0.7*super.q()
        else
            return 1.5*super.q()
    }
    override fun q(): Double
    {
        var q= 100 * plosh / chena
        return q
    }
    override fun info(): String
    {
        return "Оператор связи - $name\nСтоимость минут составляет - $chena р.\nПлошаль покрытия - $plosh\nКачество звонка - ${Q()}\nКачество Q - ${q()}"
    }
}