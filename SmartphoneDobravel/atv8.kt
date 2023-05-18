// Descrição: Programa que ativa ou desativa a tela de smartphones comuns e dobráveis.

open class Phone(open var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(override var isScreenLightOn: Boolean = false, var isPhoneFoldedUp: Boolean = false) : Phone(isScreenLightOn){
    
    fun foldedUp(){
    	isPhoneFoldedUp = true
    }
    
    fun unfolded(){
    	isPhoneFoldedUp = false
    }
    
    override fun switchOn(){
        isScreenLightOn = if (isPhoneFoldedUp) false else true
	}
    
    override fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("Sobrescrito The phone screen's light is $phoneScreenLight.")
    }
}
