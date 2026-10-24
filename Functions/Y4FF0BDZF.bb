Function Y4FF0BDZF%(arg0.TX2BF6X0FF4, arg1%, arg2#, arg3#)
    If (((arg2 <> arg0\Field43[arg1]\Field5) Lor (arg3 <> arg0\Field43[arg1]\Field4)) <> 0) Then
        arg0\Field43[arg1]\Field5 = arg2
        arg0\Field43[arg1]\Field4 = arg3
        arg0\Field43[arg1]\Field1 = $01
    EndIf
    Return $00
End Function
