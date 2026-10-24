Function usedoornpc%(arg0.npcs, arg1%, arg2%)
    Local local0#
    Local local1%
    local0 = entitydistancesquared(arg0\Field82, arg0\Field71[arg0\Field48]\Field0)
    If (arg0\Field77 = $18) Then
        If (1.0 > local0) Then
            If (arg0\Field71[arg0\Field48]\Field7 <> Null) Then
                If ((((arg0\Field71[arg0\Field48]\Field7\Field39 = $00) And (arg0\Field71[arg0\Field48]\Field7\Field28 = $00)) And (arg0\Field71[arg0\Field48]\Field7\Field46 <> $01)) <> 0) Then
                    openclosedoor(arg0\Field71[arg0\Field48]\Field7, arg1, arg2)
                    If (arg1 <> 0) Then
                        playsoundex(npcsound[$00], camera, arg0\Field98, 8.0, 1.0, $00, $00)
                    EndIf
                    If (arg0\Field71[arg0\Field48]\Field7\Field47 <> 0) Then
                        arg0\Field71[arg0\Field48]\Field7\Field9 = ((((Float ((playerroom\Field22\Field21 = $4C) Lor (playerroom\Field22\Field21 = $4E))) * 50.0) + 5.0) * 70.0)
                    EndIf
                EndIf
            EndIf
            If (0.05 > local0) Then
                arg0\Field48 = (arg0\Field48 + $01)
            EndIf
        EndIf
    ElseIf (0.49 > local0) Then
        local1 = $01
        If (arg0\Field71[arg0\Field48]\Field7 <> Null) Then
            If (((arg0\Field71[arg0\Field48]\Field7\Field39 = $00) And ((((((arg0\Field71[arg0\Field48]\Field7\Field46 = $01) Lor (arg0\Field71[arg0\Field48]\Field7\Field21 > $00)) Lor (arg0\Field71[arg0\Field48]\Field7\Field44 <> $00)) Lor (arg0\Field71[arg0\Field48]\Field7\Field52 <> $00)) Lor (arg0\Field71[arg0\Field48]\Field7\Field40[$00] = $00)) Lor (arg0\Field71[arg0\Field48]\Field7\Field40[$01] = $00))) <> 0) Then
                local1 = $00
            ElseIf (arg0\Field71[arg0\Field48]\Field7\Field39 = $00) Then
                openclosedoor(arg0\Field71[arg0\Field48]\Field7, arg1, arg2)
                If (arg0\Field77 = $03) Then
                    arg0\Field71[arg0\Field48]\Field7\Field9 = 175.0
                EndIf
            EndIf
        EndIf
        If (((0.05 > local0) And local1) <> 0) Then
            arg0\Field48 = (arg0\Field48 + $01)
        ElseIf (((0.25 > local0) And (local1 = $00)) <> 0) Then
            arg0\Field30 = $00
            arg0\Field8 = 420.0
            arg0\Field48 = $00
        EndIf
    EndIf
    Return $00
End Function
