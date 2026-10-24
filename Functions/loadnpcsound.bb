Function loadnpcsound%(arg0.npcs, arg1$, arg2%)
    If (arg2 = $00) Then
        If (arg0\Field55 <> $00) Then
            freesound_strict(arg0\Field55)
            arg0\Field55 = $00
        EndIf
        arg0\Field55 = loadsound_strict(arg1)
        Return arg0\Field55
    ElseIf (arg2 = $01) Then
        If (arg0\Field67 <> $00) Then
            freesound_strict(arg0\Field67)
            arg0\Field67 = $00
        EndIf
        arg0\Field67 = loadsound_strict(arg1)
        Return arg0\Field67
    EndIf
    Return $00
End Function
