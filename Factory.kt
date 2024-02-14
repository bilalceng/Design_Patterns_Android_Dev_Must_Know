enum class DialogType{
    VOICED_DIALOG,
    VIDEO_DIALOG,
    VOICE_AND_VIDEO_DIALOG
}

sealed class Dialog(val message: String){
    class CreateVoicedDialog(message: String) : Dialog(message)
    class CreateVideoDialog(message: String) : Dialog(message)
    class CreateVoicedAndVideoDialog(message: String) : Dialog(message)
}

object Factory{
    fun createDialog(dialogType: DialogType) = when(dialogType){
        DialogType.VOICED_DIALOG -> Dialog.CreateVoicedDialog("Voiced Dialog Created successfully.")
        DialogType.VIDEO_DIALOG -> Dialog.CreateVideoDialog("Video Dialog Created successfully.")
        DialogType.VOICE_AND_VIDEO_DIALOG -> Dialog.CreateVoicedAndVideoDialog("Video Voiced dialog Created successfully.")
    }
}

fun main(){
    var voicedDialog = Factory.createDialog(DialogType.VOICED_DIALOG)
    println(voicedDialog.message)//Voiced Dialog Created successfully.
}