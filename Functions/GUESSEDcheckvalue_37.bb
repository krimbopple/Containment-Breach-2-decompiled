Function GUESSEDcheckvalue_37%(arg0.TX2BF6X0FF4, arg1%, arg2%, arg3%)
    If (((arg0\Field43[arg1]\Field0 <> arg2) Lor (arg0\Field43[arg1]\Field3 <> arg3)) <> 0) Then
        arg0\Field43[arg1]\Field0 = arg2
        arg0\Field43[arg1]\Field3 = arg3
        arg0\Field43[arg1]\Field1 = $01
    EndIf
    Return $00
End Function
