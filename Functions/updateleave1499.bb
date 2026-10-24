Function updateleave1499%()
    Local local0.rooms
    Local local1.items
    Local local2.rooms
    Local local3.rooms
    Local local4.npcs
    Local local5%
    Local local6#
    Local local7#
    If (((i_1499\Field8 = $00) And (playerroom\Field22\Field21 = $70)) <> 0) Then
        For local0 = Each rooms
            If (local0 = i_1499\Field2) Then
                isblackout = previsblackout
                previsblackout = $01
                XZ0260X8X2\Field53 = -10.0
                i_1499\Field5 = entityx(XZ0260X8X2\Field74, $00, 1.0)
                i_1499\Field0 = entityy(XZ0260X8X2\Field74, $00, 1.0)
                i_1499\Field7 = entityz(XZ0260X8X2\Field74, $00, 1.0)
                teleportentity(XZ0260X8X2\Field74, i_1499\Field1, (i_1499\Field3 + 0.125), i_1499\Field6, 0.3, $00, 2.0, $00)
                teleporttoroom(local0)
                If (((i_1499\Field2\Field22\Field21 = $20) And (infacility = $FFFFFFFF)) <> 0) Then
                    For local5 = $00 To $03 Step $01
                        playerroom\Field32[local5]\Field66 = 2.0
                        positionentity(playerroom\Field32[local5]\Field82, entityx(playerroom\Field27[(Int playerroom\Field32[local5]\Field65)], $01, 1.0), (entityy(playerroom\Field27[(Int playerroom\Field32[local5]\Field65)], $01, 1.0) + 0.1), entityz(playerroom\Field27[(Int playerroom\Field32[local5]\Field65)], $01, 1.0), $00)
                        resetentity(playerroom\Field32[local5]\Field82)
                        playerroom\Field32[local5]\Field65 = (playerroom\Field32[local5]\Field65 + 1.0)
                        If ((Float playerroom\Field32[local5]\Field13) < playerroom\Field32[local5]\Field65) Then
                            playerroom\Field32[local5]\Field65 = (Float (playerroom\Field32[local5]\Field13 - $03))
                        EndIf
                    Next
                EndIf
                For local2 = Each rooms
                    If (local2\Field22\Field21 = $70) Then
                        local3 = local2
                        Exit
                    EndIf
                Next
                For local1 = Each items
                    If (((local1\Field6\Field9 = $22) Lor (local1\Field6\Field9 = $23)) <> 0) Then
                        local6 = entityy(local1\Field9, $00, 1.0)
                        local7 = entityy(local3\Field15, $00, 1.0)
                        If (local6 >= (local7 - 5.0)) Then
                            positionentity(local1\Field9, i_1499\Field1, (i_1499\Field3 + (local6 - local7)), i_1499\Field6, $00)
                            resetentity(local1\Field9)
                            Exit
                        EndIf
                    EndIf
                Next
                For local4 = Each npcs
                    If (((((local4\Field1 = $00) And (local4\Field77 <> $10)) And (local4\Field77 <> $0B)) And (local4\Field77 <> $15)) <> 0) Then
                        positionentity(local4\Field82, entityx(local4\Field82, $01, 1.0), (entityy(local4\Field82, $01, 1.0) + 0.125), entityz(local4\Field82, $01, 1.0), $01)
                        resetentity(local4\Field82)
                    EndIf
                Next
                local3 = Null
                clearfogcolor()
                playsound_strict(loadtempsound("SFX\SCP\1499\Exit.ogg"), $00, $00)
                i_1499\Field1 = 0.0
                i_1499\Field3 = 0.0
                i_1499\Field6 = 0.0
                i_1499\Field2 = Null
                Exit
            EndIf
        Next
    EndIf
    Return $00
End Function
