Function GUESSEDcheckvalue_40%(arg0.TX2BF6X0FF4, arg1%, arg2$)
    If (arg0\Field43[arg1]\Field2 <> arg2) Then
        arg0\Field43[arg1]\Field2 = arg2
        arg0\Field43[arg1]\Field1 = $01
    EndIf
    Return $00
End Function
