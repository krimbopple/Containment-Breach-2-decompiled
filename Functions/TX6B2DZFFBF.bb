Function TX6B2DZFFBF%(arg0.T20BFZFZ62X)
    Local local0%
    If (arg0\Field7 <> 0) Then
        Return $00
    EndIf
    If (TXB2BFFFFFX() <> 0) Then
        arg0\Field17 = $00
        arg0\Field7 = $01
        For local0 = $00 To $09 Step $01
            If (arg0\Field12[local0] <> Null) Then
                positionentity(arg0\Field12[local0]\Field9, entityx(arg0\Field4, $01, 1.0), (entityy(arg0\Field4, $01, 1.0) + 0.1), entityz(arg0\Field4, $01, 1.0), $01)
                resetentity(arg0\Field12[local0]\Field9)
                arg0\Field12[local0]\Field17 = $00
                arg0\Field12[local0] = Null
            EndIf
        Next
        For local0 = $00 To $09 Step $01
            Y04D8ZZXXF(arg0, local0, Null)
        Next
        If (arg0\Field8 > $00) Then
            X0FBD6D40(arg0, entityx(arg0\Field19, $00, 1.0), entityy(arg0\Field19, $00, 1.0), entityz(arg0\Field19, $00, 1.0), entityyaw(arg0\Field19, $00, 1.0), arg0\Field8, arg0\Field3)
        EndIf
        If ((Float FZBZD8282(arg0)) > ((Float (arg0\Field5 * $3E8)) * 0.06)) Then
            arg0\Field0 = (Int (((Float (arg0\Field5 * $3E8)) * 0.06) + (Float TX4F8ZZ4X8D())))
        EndIf
    Else
        T2D4D222DX(arg0)
    EndIf
    Return $00
End Function
