Function F48XZXBBF%(arg0.npcs, arg1#)
    If (0.001 > (Abs (animtime(arg0\Field98) - arg1))) Then
        Return $00
    EndIf
    If ((hidedistance * hidedistance) <= entitydistancesquared(arg0\Field82, XFF8DDFZ6B())) Then
        arg0\Field2 = (arg0\Field2 - fps\Field3[$00])
        If (0.0 >= arg0\Field2) Then
            setanimtime(arg0\Field98, arg1, $00)
            arg0\Field2 = (fps\Field3[$00] * 4.0)
        EndIf
        Return $00
    EndIf
    setanimtime(arg0\Field98, arg1, $00)
    Return $00
End Function
