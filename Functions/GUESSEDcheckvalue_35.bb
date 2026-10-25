Function GUESSEDcheckvalue_35%(arg0.TX2BF6X0FF4, arg1%)
    If (arg1 = $FFFFFFFF) Then
        arg0\Field10\Field5 = (arg0\Field10\Field5 = $00)
        Return $00
    EndIf
    arg0\Field10\Field5 = arg1
    Return $00
End Function
