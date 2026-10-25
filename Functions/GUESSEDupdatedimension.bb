Function GUESSEDupdatedimension%(arg0.rooms, arg1%)
    If (arg0\Field20[arg1] <> Null) Then
        arg0\Field20[arg1]\Field3 = $01
        arg0\Field20[arg1]\Field7 = $00
    EndIf
    Return $00
End Function
