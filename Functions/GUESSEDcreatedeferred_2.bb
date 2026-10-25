Function GUESSEDcreatedeferred_2%(arg0%, arg1$, arg2$)
    If (X2FZ42644B[arg0] <> Null) Then
        Return $01
    EndIf
    X2FZ42644B[arg0] = (New A262400ZZ)
    X2FZ42644B[arg0]\Field1 = GUESSEDgeteffect(("GFX\Shaders\Deferred\" + arg1), arg2, $01)
    X2FZ42644B[arg0]\Field0 = arg0
    GUESSEDcreatebank_5()
    Return $01
    Return $00
End Function
