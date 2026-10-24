Function update009%()
    Local local0#
    Local local1.rooms
    If (((0.0 < i_009\Field0) And (chs\Field0 = $00)) <> 0) Then
        local0 = i_009\Field0
        If (25200.0 > i_427\Field1) Then
            If (i_009\Field1 <> 0) Then
                i_009\Field0 = max((i_009\Field0 - (fps\Field3[$00] * 0.02)), 0.0)
            ElseIf (i_427\Field2 = $00) Then
                cansave = $00
                i_009\Field0 = min((i_009\Field0 + (fps\Field3[$00] * 0.075)), 100.0)
            EndIf
        EndIf
        If (entityhidden(X2Z260BF0Z\Field1[$0A]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$0A])
        EndIf
        entityalpha(X2Z260BF0Z\Field1[$0A], clamp(((i_009\Field0 - 91.0) / 10.0), 0.0, 0.5))
        If (i_009\Field1 = $00) Then
            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + (fps\Field3[$00] * 0.00001))
            If (((20.0 < i_009\Field0) And (20.0 >= local0)) <> 0) Then
                playsound_strict(loadtempsound("SFX\SCP\294\Burn.ogg"), $00, $00)
                injureplayer(1.2, 0.0, 700.0, 0.0, 0.0)
            ElseIf (91.0 < i_009\Field0) Then
                If (91.0 >= local0) Then
                    makemeunplayable($00)
                    XZ0260X8X2\Field1 = 3.0
                    playsound_strict(loadtempsound("SFX\SCP\009\IceCracking.ogg"), $00, $00)
                EndIf
                XZ0260X8X2\Field53 = max(-10.0, ((91.0 - i_009\Field0) * 2.0))
                If (((97.0 < i_009\Field0) And (97.0 >= local0)) <> 0) Then
                    For local1 = Each rooms
                        If (playerroom = local1) Then
                            msg\Field8 = getlocalstring("death", "009_1")
                            Exit
                        ElseIf (isroomadjacent(playerroom, local1) <> 0) Then
                            msg\Field8 = getlocalstring("death", "009_2")
                            Exit
                        Else
                            msg\Field8 = format(getlocalstring("death", "009_3"), subjectname, "%s")
                        EndIf
                    Next
                    XZ0260X8X2\Field38 = $02
                    kill($00, $01, $00, $01)
                EndIf
            EndIf
        EndIf
    Else
        i_009\Field1 = $00
        If (entityhidden(X2Z260BF0Z\Field1[$0A]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$0A])
        EndIf
    EndIf
    Return $00
End Function
