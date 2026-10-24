Function setnpcframe%(arg0.npcs, arg1#, arg2%)
    If (0.001 > (Abs (arg0\Field103 - arg1))) Then
        Return $00
    EndIf
    If ((hidedistance * hidedistance) <= entitydistancesquared(arg0\Field82, XFF8DDFZ6B())) Then
        arg0\Field2 = (arg0\Field2 - fps\Field3[$00])
        If (0.0 >= arg0\Field2) Then
            setanimtime(arg0\Field98, arg1, $00)
            arg0\Field2 = (fps\Field3[$00] * 4.0)
        EndIf
    Else
        setanimtime(arg0\Field98, arg1, $00)
    EndIf
    If (arg2 <> 0) Then
        arg0\Field0 = arg1
    EndIf
    arg0\Field103 = arg1
    Return $00
End Function
