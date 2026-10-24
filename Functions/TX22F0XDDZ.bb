Function TX22F0XDDZ%(arg0%, arg1%, arg2%, arg3%, arg4%)
    TB046BD8D2(arg1, ((arg0 And $FF000000) Shr $18))
    TB046BD8D2(arg2, ((arg0 And $FF0000) Shr $10))
    TB046BD8D2(arg3, ((arg0 And $FF00) Shr $08))
    TB046BD8D2(arg4, (arg0 And $FF))
    Return $00
End Function
