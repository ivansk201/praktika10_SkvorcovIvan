abstract class Operator(_name:String, _chena:Double, _plosh:Double):InterfaceOperator
{
    override var name: String=_name
    override var chena: Double=_chena
    override var plosh: Double=_plosh
    constructor(chena:Double, plosh:Double):this("", chena, plosh)
    abstract fun Q():Double
    override fun q(): Double
    {
        var q=100 * plosh / chena
        return q
    }
    override fun info(): String {
        return "Оператор связи - $name\nСтоимость минут составляет - $chena р.\nПлошаль покрытия - $plosh\nКачество звонка - ${Q()}\nКачество Q - ${q()}"
    }
}