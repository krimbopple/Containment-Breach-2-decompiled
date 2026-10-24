Function blitz_F24F084XB0%(arg0%, arg1%)
    tformpoint(entityx(arg0, $01, 1.0), entityy(arg0, $01, 1.0), entityz(arg0, $01, 1.0), $00, arg1)
    Return (((0.5 > (Abs tformedx())) And (0.5 > (Abs tformedy()))) And (0.5 > (Abs tformedz())))
    Return $00
End Function
