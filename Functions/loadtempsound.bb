Function loadtempsound%(arg0$)
    Local local0%
    Local local1%
    For local1 = $00 To $14 Step $01
        If (tempsoundsname[local1] = arg0) Then
            Return tempsounds[local1]
        EndIf
    Next
    If (tempsounds[tempsoundindex] <> $00) Then
        freesound_strict(tempsounds[tempsoundindex])
        tempsounds[tempsoundindex] = $00
    EndIf
    local0 = loadsound_strict(arg0)
    tempsounds[tempsoundindex] = local0
    tempsoundsname[tempsoundindex] = arg0
    tempsoundindex = ((tempsoundindex + $01) Mod $14)
    Return local0
    Return $00
End Function
