Function EXDFFFFD2%(arg0.doors, arg1#)
    Local local0%
    If (isequal(getentityalpha(arg0\Field0), arg1, 0.001) <> 0) Then
        Return $00
    EndIf
    entityalpha(arg0\Field0, arg1)
    If (arg0\Field7 <> $00) Then
        entityalpha(arg0\Field7, arg1)
    EndIf
    For local0 = $00 To $01 Step $01
        If (((arg0\Field40[local0] <> $00) And (arg0\Field28 = $00)) <> 0) Then
            entityalpha(arg0\Field40[local0], arg1)
            If (0.0 < arg1) Then
                TX2X864822(arg0\Field40[local0])
            Else
                EZ8ZF240(arg0\Field40[local0])
            EndIf
        EndIf
        If (arg0\Field24[local0] <> $00) Then
            entityalpha(arg0\Field24[local0], arg1)
        EndIf
    Next
    If (arg0\Field46 <> $06) Then
        entityalpha(arg0\Field51, arg1)
    EndIf
    Return $00
End Function
