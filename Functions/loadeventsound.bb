Function loadeventsound%(arg0.events, arg1$, arg2%)
    If (arg2 = $00) Then
        If (arg0\Field0 <> $00) Then
            freesound_strict(arg0\Field0)
            arg0\Field0 = $00
        EndIf
        arg0\Field0 = loadsound_strict(arg1)
        Return arg0\Field0
    ElseIf (arg2 = $01) Then
        If (arg0\Field30 <> $00) Then
            freesound_strict(arg0\Field30)
            arg0\Field30 = $00
        EndIf
        arg0\Field30 = loadsound_strict(arg1)
        Return arg0\Field30
    EndIf
    Return $00
End Function
