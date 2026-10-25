Function GUESSEDdeletestream%(arg0.TX2BF6X0FF4)
    If (arg0\Field10 = Null) Then
        Return $00
    EndIf
    BASS_StreamFree(arg0\Field10\Field7[$00])
    BASS_StreamFree(arg0\Field10\Field7[$01])
    BASS_StreamFree(arg0\Field10\Field7[$02])
    Delete arg0\Field10
    Return $00
End Function
