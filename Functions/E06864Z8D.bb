Function E06864Z8D%(arg0%, arg1$, arg2$)
    If (F24284F28[arg0] <> Null) Then
        Return $01
    EndIf
    F24284F28[arg0] = (New F4X4XZ2BZ)
    F24284F28[arg0]\Field1 = T2B0ZBDBDB(("GFX\Shaders\Deferred\" + arg1), arg2, $01)
    F24284F28[arg0]\Field0 = arg0
    TF6DBD6646()
    Return $01
    Return $00
End Function
