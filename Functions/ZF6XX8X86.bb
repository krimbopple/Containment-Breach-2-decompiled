Function ZF6XX8X86%(arg0.TX2BF6X0FF4, arg1%, arg2#)
    If (arg2 <> arg0\Field43[arg1]\Field8) Then
        arg0\Field43[arg1]\Field8 = arg2
        arg0\Field43[arg1]\Field1 = $01
    EndIf
    Return $00
End Function
