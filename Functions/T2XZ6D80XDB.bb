Function T2XZ6D80XDB%(arg0.npcs, arg1%)
    Local local0%
    If (arg1 <> $FFFFFFFF) Then
        If (arg0\Field56 > $00) Then
            XD0D068644[arg0\Field56] = Null
        EndIf
        XD0D068644[arg1] = arg0
        arg0\Field56 = arg1
    Else
        For local0 = $01 To $FF Step $01
            If (XD0D068644[local0] = Null) Then
                XD0D068644[local0] = arg0
                arg0\Field56 = local0
                Exit
            EndIf
        Next
    EndIf
    Select arg0\Field77
        Case $08
            n_i\Field3 = arg0
        Case $07
            n_i\Field2 = arg0
        Case $06
            n_i\Field10 = arg0
        Case $0A
            n_i\Field6 = arg0
        Case $0B
            n_i\Field0 = arg0
            arg0\Field50 = $01
        Case $03
            n_i\Field8 = arg0
        Case $05
            n_i\Field1 = arg0
        Case $09,$12,$15
            arg0\Field50 = $01
    End Select
    Return $00
End Function
