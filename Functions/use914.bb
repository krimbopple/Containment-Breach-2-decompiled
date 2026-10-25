Function use914%(arg0.items, arg1%, arg2#, arg3#, arg4#)
    Local local0.items
    Local local1.items
    Local local2.items
    Local local3.npcs
    Local local4.rooms
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local30%
    Local local31%
    Local local39%
    Local local49%
    Local local50%
    Local local51%
    Local local65%
    Local local79%
    XZ0260X8X2\Field80 = (XZ0260X8X2\Field80 + $01)
    If (((GUESSEDupdatexdb() <> $00) And (GUESSEDupdateanimatenpc() = $00)) <> 0) Then
        Return $00
    EndIf
    local5 = $01
    local8 = $00
    Select arg0\Field6\Field9
        Case $38,$39,$3A,$3B
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (rand($04, $01) = $01) Then
                        local1 = createitem("Hazmat Suit", $3C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Gas Mask", $38, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01
                    If (rand($4B, $01) = $01) Then
                        local1 = createitem("SCP-1499", $22, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Fine Gas Mask", $39, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($96, $01) = $01) Then
                        local1 = createitem("SCP-1499", $22, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Very Fine Gas Mask", $3A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $22,$23
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Gas Mask", $38, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Fine SCP-1499", $23, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local3 = createnpc($12, arg2, arg3, arg4)
                    local3\Field66 = 1.0
                    local3\Field57 = 1.0
                    local3\Field63 = playsoundex(loadtempsound("SFX\SCP\1499\Triggered.ogg"), camera, local3\Field82, 20.0, 1.0, $00, $00)
                    local3\Field50 = $00
            End Select
        Case $40,$41,$42
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Electronical Components", $2F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("SCRAMBLE Gear", $43, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 1000.0)
                Case $01
                    local1 = createitem("Fine Night Vision Goggles", $42, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Very Fine Night Vision Goggles", $41, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 1000.0)
            End Select
        Case $43,$44
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Electronical Components", $2F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("Night Vision Goggles", $40, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 1000.0)
                Case $01,$02
                    local1 = createitem("Fine SCRAMBLE Gear", $44, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 1000.0)
            End Select
        Case $26
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Ballistic Vest", $27, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    local1 = createitem("Heavy Ballistic Helmet", $74, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $74
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Ballistic Helmet", $26, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("Heavy Ballistic Vest", $28, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    local1 = createitem("Heavy Ballistic Helmet", $74, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $0B,$0C,$0D
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Newsboy Cap", $0B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local5 = $00
                Case $01,$02
                    local1 = createitem("Fine SCP-268", $0D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $27,$28
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Corrosive Ballistic Vest", $29, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("Ballistic Helmet", $26, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Heavy Ballistic Vest", $28, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Bulky Ballistic Vest", $2A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $3C,$3D,$3F
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Hazmat Suit", $3C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Fine Hazmat Suit", $3D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Very Fine Hazmat Suit", $3E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $3E
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Hazmat Suit", $3C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    local1 = createitem("Infected Syringe", $58, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $2D,$2E
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                    clearsecondinv(arg0, $00)
                Case $FFFFFFFF
                    If (arg0\Field36 > $05) Then
                        arg0\Field36 = (arg0\Field36 - $05)
                        clearsecondinv(arg0, arg0\Field36)
                    ElseIf (arg0\Field36 = $05) Then
                        arg0\Field36 = $01
                        clearsecondinv(arg0, $01)
                    Else
                        local8 = $01
                        clearsecondinv(arg0, $00)
                    EndIf
                    local5 = $00
                Case $00
                    local5 = $00
                Case $01
                    If (arg0\Field36 = $01) Then
                        arg0\Field36 = $05
                    Else
                        arg0\Field36 = (Int min(20.0, (Float (arg0\Field36 + $05))))
                    EndIf
                    local5 = $00
                Case $02
                    If (arg0\Field36 = $01) Then
                        arg0\Field36 = $0A
                    Else
                        arg0\Field36 = (Int min(20.0, (Float (arg0\Field36 + $0A))))
                    EndIf
                    local5 = $00
            End Select
        Case $2F
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local5 = $00
                Case $01
                    For local0 = Each items
                        If ((((local0 <> arg0) And (local0\Field9 <> $00)) And (local0\Field17 = $00)) <> 0) Then
                            If ((1.0 / 2.022716) > distancesquared(entityx(local0\Field9, $01, 1.0), arg2, entityz(local0\Field9, $01, 1.0), arg4, 0.0, 0.0)) Then
                                If (local0\Field6\Field9 = $2D) Then
                                    removeitem(local0, $01)
                                    local1 = createitem("E-Reader", $4D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    local1\Field15 = rnd(0.0, 100.0)
                                    Exit
                                EndIf
                            EndIf
                        EndIf
                    Next
                    If (local1 = Null) Then
                        Select rand($03, $01)
                            Case $01
                                local1 = createitem("Radio Transceiver", $45, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = rnd(0.0, 100.0)
                            Case $02
                                If (rand($03, $01) = $01) Then
                                    local1 = createitem("S-NAV 300 Navigator", $4A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Else
                                    local1 = createitem("S-NAV Navigator", $49, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    local1\Field15 = rnd(0.0, 100.0)
                                EndIf
                            Case $03
                                local1 = createitem("Night Vision Goggles", $40, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = rnd(0.0, 1000.0)
                        End Select
                    EndIf
                Case $02
                    For local0 = Each items
                        If ((((local0 <> arg0) And (local0\Field9 <> $00)) And (local0\Field17 = $00)) <> 0) Then
                            If ((1.0 / 2.022716) > distancesquared(entityx(local0\Field9, $01, 1.0), arg2, entityz(local0\Field9, $01, 1.0), arg4, 0.0, 0.0)) Then
                                If (local0\Field6\Field9 = $2D) Then
                                    removeitem(local0, $01)
                                    local1 = createitem("E-Reader", $4D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    local1\Field15 = rnd(0.0, 100.0)
                                    Exit
                                EndIf
                            EndIf
                        EndIf
                    Next
                    If (local1 = Null) Then
                        Select rand($03, $01)
                            Case $01
                                If (rand($03, $01) = $01) Then
                                    local1 = createitem("Fine Radio Transceiver", $47, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Else
                                    local1 = createitem("Very Fine Radio Transceiver", $48, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                EndIf
                            Case $02
                                If (rand($02, $01) = $01) Then
                                    local1 = createitem("S-NAV 300 Navigator", $4A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Else
                                    local1 = createitem("S-NAV 310 Navigator", $4B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    local1\Field15 = rnd(0.0, 100.0)
                                EndIf
                            Case $03
                                Select rand($04, $01)
                                    Case $01
                                        local1 = createitem("Fine Night Vision Goggles", $42, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    Case $02
                                        local1 = createitem("Very Fine Night Vision Goggles", $41, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = rnd(0.0, 1000.0)
                                    Case $03
                                        local1 = createitem("SCRAMBLE Gear", $43, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = rnd(0.0, 1000.0)
                                    Case $04
                                        local1 = createitem("Fine SCRAMBLE Gear", $44, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                End Select
                        End Select
                    EndIf
            End Select
        Case $0A
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("SCP-148 Ingot", $09, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00,$01,$02
                    local5 = $00
            End Select
        Case $09
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local1 = createitem("SCP-148 Ingot", $09, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00,$01,$02
                    For local0 = Each items
                        If ((((local0 <> arg0) And (local0\Field9 <> $00)) And (local0\Field17 = $00)) <> 0) Then
                            If ((1.0 / 2.022716) > distancesquared(entityx(local0\Field9, $01, 1.0), arg2, entityz(local0\Field9, $01, 1.0), arg4, 0.0, 0.0)) Then
                                Select local0\Field6\Field9
                                    Case $38,$39,$3A
                                        removeitem(local0, $01)
                                        local1 = createitem("Heavy Gas Mask", $3B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        Exit
                                    Case $3C,$3D,$3E
                                        removeitem(local0, $01)
                                        local1 = createitem("Heavy Hazmat Suit", $3F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        Exit
                                End Select
                            EndIf
                        EndIf
                    Next
                    If (local1 = Null) Then
                        local1 = createitem("Metal Panel", $0A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $64,$65,$66
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (arg0\Field6\Field9 = $65) Then
                        local1 = createitem("White Severed Hand", $64, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Black Severed Hand", $65, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01,$02
                    local3 = createnpc($01, arg2, arg3, arg4)
                    local3\Field66 = 3.0
            End Select
        Case $34,$35,$36,$37
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (arg0\Field6\Field9 = $34) Then
                        local1 = createitem("Blue First Aid Kit", $35, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("First Aid Kit", $34, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01
                    local1 = createitem("Compact First Aid Kit", $36, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Strange Bottle", $37, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $59,$5A,$5B,$5C,$5D,$5E,$5F
            local30 = arg0\Field6\Field9
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    If (local30 = $59) Then
                        local8 = $01
                    ElseIf (local30 = $5F) Then
                        local1 = createitem("Level 0 Key Card", $59, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        Select local30
                            Case $5A
                                local31 = $01
                            Case $5B
                                local31 = $02
                            Case $5C
                                local31 = $03
                            Case $5D
                                local31 = $04
                            Case $5E
                                local31 = $05
                        End Select
                        local1 = createitem((("Level " + (Str (local31 - $01))) + " Key Card"), (local30 - $01), arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $00
                    local1 = createitem("Playing Card", $63, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    Select local30
                        Case $59
                            Select selecteddifficulty\Field8
                                Case $00
                                    local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Case $01
                                    If (rand($06, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $02
                                    If (rand($05, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $03
                                    If (rand($04, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                            End Select
                        Case $5A
                            Select selecteddifficulty\Field8
                                Case $00
                                    local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Case $01
                                    If (rand($05, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $02
                                    If (rand($04, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $03
                                    If (rand($03, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                            End Select
                        Case $5B
                            Select selecteddifficulty\Field8
                                Case $00
                                    local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Case $01
                                    If (rand($04, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $02
                                    If (rand($03, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $03
                                    If (rand($02, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                            End Select
                        Case $5C
                            If (rand(((selecteddifficulty\Field8 * $06) + $10), $01) = $01) Then
                                local1 = createitem("Level 4 Key Card", $5D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            Else
                                local1 = createitem("Playing Card", $63, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $5D
                            Select selecteddifficulty\Field8
                                Case $00
                                    local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                Case $01
                                    If (rand($03, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $02
                                    If (rand($02, $01) = $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                                Case $03
                                    If (rand($03, $01) > $01) Then
                                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                        local1\Field15 = (Float rand($00, $06))
                                    Else
                                        local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                    EndIf
                            End Select
                        Case $5E
                            local39 = (Int max((Float ((((_S2IMapSize(achievementsindex) - $04) - (_S2IMapSize(unlockedachievements) - $01)) - _S2IMapContains(unlockedachievements, "apollyon")) * (selecteddifficulty\Field8 + $02))), 0.0))
                            If (rand($00, local39) = $00) Then
                                local1 = createitem("Key Card Omni", $60, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (rand(((selecteddifficulty\Field8 * $06) + $10), $01) = $01) Then
                                local1 = createitem("Level 6 Key Card", $5F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (rand($23, $01) = $01) Then
                                local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = 1000.0
                            Else
                                local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = (Float rand($00, $06))
                            EndIf
                        Case $5F
                            If (rand(((selecteddifficulty\Field8 Shl $02) + $08), $01) = $01) Then
                                local1 = createitem("Key Card Omni", $60, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (rand($05, $01) = $01) Then
                                local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = 1000.0
                            Else
                                local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                local1\Field15 = (Float rand($00, $06))
                            EndIf
                    End Select
                Case $02
                    local39 = (Int max((Float ((((_S2IMapSize(achievementsindex) - $04) - (_S2IMapSize(unlockedachievements) - $01)) - _S2IMapContains(unlockedachievements, "apollyon")) * (selecteddifficulty\Field8 + $05))), 0.0))
                    If (rand($00, local39) = $00) Then
                        local1 = createitem("Key Card Omni", $60, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    ElseIf (rand(((selecteddifficulty\Field8 Shl $03) + $20), $01) = $01) Then
                        local1 = createitem("Level 6 Key Card", $5F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Mastercard", $61, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = (Float rand($00, $06))
                    EndIf
            End Select
        Case $60
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (rand($02, $01) = $01) Then
                        local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = 1000.0
                    Else
                        local1 = createitem("Playing Card", $63, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01,$02
                    If (rand(((selecteddifficulty\Field8 * $03) + $06), $01) = $01) Then
                        local1 = createitem("Level 6 Key Card", $5F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = 1000.0
                    EndIf
            End Select
        Case $63,$6B,$6A
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Level 0 Key Card", $59, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $61
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Quarter", $6A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("Level 0 Key Card", $59, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    If (rand($37, $01) = $01) Then
                        local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = 1000.0
                    Else
                        local1 = createitem("Level 1 Key Card", $5A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($4B, $01) = $01) Then
                        local1 = createitem("Golden Mastercard", $62, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = 1000.0
                    Else
                        local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $62
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    For local6 = $00 To $03 Step $01
                        local1 = createitem("Quarter", $6A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Next
                Case $00
                    local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    If (rand($23, $01) = $01) Then
                        local1 = createitem("Level 4 Key Card", $5D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($2D, $01) = $01) Then
                        local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $06,$07,$08
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Coarse SCP-005", $07, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    If (rand($08, $01) = $01) Then
                        local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local2 = createitem("White Severed Hand", $64, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                        local2 = createitem("Black Severed Hand", $65, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                        local2 = createitem("Yellow Severed Hand", $66, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                        local2 = createitem("White Key", $68, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                        local2 = createitem("Yellow Key", $67, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    Else
                        local1 = createitem("SCP-005", $06, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01,$02
                    If (arg0\Field6\Field9 = $08) Then
                        local1 = createitem("SCP-005", $06, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local5 = $00
                    EndIf
            End Select
        Case $1C,$1D
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (arg0\Field6\Field9 <> $1C) Then
                        local1 = createitem("SCP-860", $1C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("White Key", $68, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01
                    If (rand(((selecteddifficulty\Field8 Shl $02) + $08), $01) = $01) Then
                        local1 = createitem("Fine SCP-860", $1D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local5 = $00
                    EndIf
                Case $02
                    If (rand(((selecteddifficulty\Field8 * $06) + $0C), $01) = $01) Then
                        local1 = createitem("Fine SCP-860", $1D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local5 = $00
                    EndIf
            End Select
        Case $69,$68,$67
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (arg0\Field6\Field9 = $68) Then
                        local1 = createitem("Yellow Key", $67, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("White Key", $68, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    ElseIf (arg0\Field6\Field9 = $68) Then
                        local1 = createitem("Yellow Key", $67, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("White Key", $68, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($06, $01) = $01) Then
                        local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    ElseIf (arg0\Field6\Field9 = $68) Then
                        local1 = createitem("Yellow Key", $67, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("White Key", $68, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $45,$46,$47,$48
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Electronical Components", $2F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("18V Radio Transceiver", $46, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 100.0)
                Case $01
                    local1 = createitem("Fine Radio Transceiver", $47, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Very Fine Radio Transceiver", $48, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $49,$4A,$4B,$4C
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Electronical Components", $2F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("S-NAV Navigator", $49, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 100.0)
                Case $01
                    local1 = createitem("S-NAV 310 Navigator", $4B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    local1\Field15 = rnd(0.0, 100.0)
                Case $02
                    local49 = $00
                    local50 = $00
                    For local4 = Each rooms
                        local51 = local4\Field22\Field21
                        If (((((((local51 <> $04) And (local51 <> $4C)) And (local51 <> $4E)) And (local51 <> $72)) And (local51 <> $6F)) And (local51 <> $70)) <> 0) Then
                            local49 = (local49 + $01)
                            local50 = (local50 + local4\Field7)
                        EndIf
                    Next
                    If (rand((Int max((Float ((local49 - (local50 Shl $01)) * (selecteddifficulty\Field8 + $01))), 1.0)), $01) = $01) Then
                        local1 = createitem("S-NAV Navigator Ultimate", $4C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("S-NAV 300 Navigator", $4A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $17,$7B
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    playsound_strict(loadtempsound("SFX\SCP\513\914Refine.ogg"), $00, $00)
                    For local3 = Each npcs
                        If (local3\Field77 = $0B) Then
                            removenpc(local3)
                        EndIf
                    Next
                    local8 = $01
                Case $00
                    local5 = $00
                Case $01,$02
                    local1 = createitem("Fine SCP-513", $7B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $0E,$0F,$10,$11
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Cigarette", $0F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Joint", $10, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Smelly Joint", $11, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $19,$18,$1A,$1B
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("SCP-714", $18, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    If (arg0\Field6\Field9 = $19) Then
                        local1 = createitem("Green Jade Ring", $1B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("SCP-714", $19, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01,$02
                    local1 = createitem("Fine SCP-714", $1A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $51
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local5 = $00
                Case $01
                    local1 = createitem("9V Battery", $50, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("18V Battery", $52, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $50
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("4.5V Battery", $51, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local5 = $00
                Case $01
                    local1 = createitem("18V Battery", $52, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    If (rand($05, $01) = $01) Then
                        local1 = createitem("999V Battery", $53, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Strange Battery", $54, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $52
            Select arg1
                Case $FFFFFFFE
                    local1 = createitem("4.5V Battery", $51, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $FFFFFFFF
                    local1 = createitem("9V Battery", $50, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local5 = $00
                Case $01,$02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("999V Battery", $53, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Strange Battery", $54, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $53
            Select arg1
                Case $FFFFFFFE
                    local1 = createitem("4.5V Battery", $51, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $FFFFFFFF
                    local1 = createitem("9V Battery", $50, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00,$01,$02
                    local1 = createitem("Strange Battery", $54, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $30,$31,$32,$33
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    If (rand($02, $01) = $01) Then
                        local1 = createitem("ReVision Eyedrops", $30, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("RedVision Eyedrops", $31, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01
                    local1 = createitem("Fine Eyedrops", $32, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    local1 = createitem("Very Fine Eyedrops", $33, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $55
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Compact First Aid Kit", $36, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Fine Syringe", $56, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("Very Fine Syringe", $57, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Infected Syringe", $58, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $56
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("First Aid Kit", $34, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem("Blue First Aid Kit", $35, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("Very Fine Syringe", $57, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Infected Syringe", $58, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $57
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF,$00
                    local1 = createitem("Electronical Components", $2F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local1 = createitem("Infected Syringe", $58, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    If (rand($02, $01) = $01) Then
                        local3 = createnpc($01, arg2, arg3, arg4)
                        local3\Field66 = 2.0
                    Else
                        local1 = createitem("Infected Syringe", $58, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $58
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local3 = createnpc($01, arg2, arg3, arg4)
                    local3\Field66 = 2.0
                Case $01
                    local1 = createitem("Syringe", $55, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $02
                    If (rand($04, $01) = $01) Then
                        local1 = createitem("Blue First Aid Kit", $35, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Fine Syringe", $56, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $14,$15,$16
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Pill", $16, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    local65 = $00
                    For local2 = Each items
                        If (local2\Field6\Field9 = $12) Then
                            local65 = $01
                            Exit
                        EndIf
                    Next
                    If (local65 <> 0) Then
                        local1 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("SCP-427", $12, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $13
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    If (rand($02, $01) = $01) Then
                        local2 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                    If (rand($03, $01) = $01) Then
                        local2 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                    If (rand($04, $01) = $01) Then
                        local2 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                Case $01
                    local65 = $00
                    For local2 = Each items
                        If (local2\Field6\Field9 = $12) Then
                            local65 = $01
                            Exit
                        EndIf
                    Next
                    If (local65 <> 0) Then
                        If (rand($02, $01) = $01) Then
                            local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            If (rand($02, $01) = $01) Then
                                local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                entitytype(local2\Field9, $03, $00)
                            EndIf
                            If (rand($03, $01) = $01) Then
                                local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                entitytype(local2\Field9, $03, $00)
                            EndIf
                            If (rand($04, $01) = $01) Then
                                local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                                entitytype(local2\Field9, $03, $00)
                            EndIf
                        Else
                            local1 = createitem("SCP-2022", $24, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            local1\Field15 = (Float rand($06, $01))
                        EndIf
                    Else
                        local1 = createitem("SCP-427", $12, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("SCP-2022", $24, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = (Float rand($06, $01))
                    Else
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        If (rand($02, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($03, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($04, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                    EndIf
            End Select
        Case $24
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    If (rand($02, $01) = $01) Then
                        local2 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                    If (rand($03, $01) = $01) Then
                        local2 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                    If (rand($04, $01) = $01) Then
                        local2 = createitem("SCP-2022-01", $25, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        entitytype(local2\Field9, $03, $00)
                    EndIf
                Case $01
                    If (rand($02, $01) = $01) Then
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        If (rand($02, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($03, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($04, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                    Else
                        local1 = createitem("SCP-500", $13, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local7 = rand($09, $01)
                        For local6 = $00 To (local1\Field36 - $01) Step $01
                            local2 = createitem("SCP-500-01", $14, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                            local2\Field17 = $01
                            local2\Field30 = $FFFFFFFF
                            local1\Field8[local6] = local2
                            hideentity(local2\Field9)
                            If (local6 = local7) Then
                                Exit
                            EndIf
                        Next
                        setanimtime(local1\Field5, max(0.0, (11.0 - (Float local7))), $00)
                    EndIf
                Case $02
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("SCP-500", $13, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local7 = rand($09, $01)
                        For local6 = $00 To (local1\Field36 - $01) Step $01
                            local2 = createitem("SCP-500-01", $14, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                            local2\Field17 = $01
                            local2\Field30 = $FFFFFFFF
                            local1\Field8[local6] = local2
                            hideentity(local2\Field9)
                            If (local6 = local7) Then
                                Exit
                            EndIf
                        Next
                        setanimtime(local1\Field5, max(0.0, (11.0 - (Float local7))), $00)
                    Else
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        If (rand($02, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($03, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                        If (rand($04, $01) = $01) Then
                            local2 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            entitytype(local2\Field9, $03, $00)
                        EndIf
                    EndIf
            End Select
        Case $25
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Pill", $16, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    If (rand($03, $01) = $01) Then
                        local1 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    If (rand($0A, $01) = $01) Then
                        local1 = createitem("SCP-2022", $24, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field15 = (Float rand($06, $01))
                    ElseIf (rand($03, $01) = $01) Then
                        local1 = createitem("SCP-500-01", $14, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Upgraded Pill", $15, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $2B
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00
                    local1 = createitem("Cup", $2B, arg2, arg3, arg4, (Int (255.0 - (Float arg0\Field16))), (Int (255.0 - (Float arg0\Field14))), (Int (255.0 - (Float arg0\Field38))), 1.0, $00)
                    local1\Field19 = arg0\Field19
                    local1\Field24 = arg0\Field24
                    local1\Field15 = arg0\Field15
                Case $01
                    local1 = createitem("Cup", $2B, arg2, arg3, arg4, (Int min(((Float arg0\Field16) * rnd(0.9, 1.1)), 255.0)), (Int min(((Float arg0\Field14) * rnd(0.9, 1.1)), 255.0)), (Int min(((Float arg0\Field38) * rnd(0.9, 1.1)), 255.0)), 1.0, $00)
                    local1\Field19 = arg0\Field19
                    local1\Field24 = arg0\Field24
                    local1\Field15 = 2.0
                Case $02
                    local1 = createitem("Cup", $2B, arg2, arg3, arg4, (Int min(((Float arg0\Field16) * rnd(0.5, 1.5)), 255.0)), (Int min(((Float arg0\Field14) * rnd(0.5, 1.5)), 255.0)), (Int min(((Float arg0\Field38) * rnd(0.5, 1.5)), 255.0)), 1.0, $00)
                    local1\Field19 = arg0\Field19
                    local1\Field24 = arg0\Field24
                    local1\Field15 = 5.0
                    If (rand($05, $01) = $01) Then
                        XZ0260X8X2\Field33 = 135.0
                    EndIf
            End Select
        Case $02
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Blank Paper", $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem(getranddocument(), $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    If (rand($0A, $01) = $01) Then
                        local1 = createitem("SCP-085", $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem(getranddocument(), $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
            End Select
        Case $00,$01
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Blank Paper", $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem(getranddocument(), $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01,$02
                    local1 = createitem("Origami", $02, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $1E,$1F,$20
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Blank Paper", $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    If (arg0\Field6\Field9 <> $1E) Then
                        local1 = createitem("SCP-1025", $1E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Book", $20, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $01,$02
                    local1 = createitem("Fine SCP-1025", $1F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $21
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    playsound_strict(loadtempsound("SFX\SCP\1123\Horror.ogg"), $00, $00)
                    If (XZ6DBZD4ZD <> Null) Then
                        removedecal(XZ6DBZD4ZD)
                    EndIf
                    XZ6DBZD4ZD = createdecal($03, arg2, 0.03625, arg4, 90.0, rnd(360.0, 0.0), 0.0, rnd(0.3, 0.4), rnd(0.8, 1.0), $01, $01, $00, $00, $00)
                Case $00
                    local5 = $00
                Case $01,$02
                    local1 = createitem("Yellow Severed Hand", $66, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $03,$04
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Blank Paper", $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local1 = createitem(getranddocument(), $00, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $01
                    If (rand($04, $01) = $01) Then
                        Select arg0\Field6\Field19
                            Case "Jim Gonazales' Badge"
                                local1 = createitem("Level 0 Key Card", $59, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            Case "Emily Ross' Badge"
                                local1 = createitem("Level 2 Key Card", $5B, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            Case "Asav Harn's Badge","Brian Skinner's Badge"
                                local1 = createitem("Level 3 Key Card", $5C, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            Case "Victor Rosewood's Badge"
                                local1 = createitem("Level 5 Key Card", $5E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            Default
                                local1 = createitem("Level 4 Key Card", $5D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        End Select
                    Else
                        local1 = createitem("Wallet", $2E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    EndIf
                Case $02
                    local1 = createitem("Clipboard", $2D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
            End Select
        Case $4D,$4E,$4F
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Clipboard", $2D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    local5 = $00
                Case $01
                    If (rand($05, $01) = $01) Then
                        local1 = createitem("E-Reader 20", $4E, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Clipboard", $2D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field36 = $0F
                    EndIf
                Case $02
                    If (rand($0F, $01) = $01) Then
                        local1 = createitem("E-Reader Ultimate", $4F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                    Else
                        local1 = createitem("Clipboard", $2D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        local1\Field36 = $14
                    EndIf
            End Select
        Case $6D,$6E,$6F,$70,$71,$72,$73,$76,$77,$79,$7A
            Select arg1
                Case $FFFFFFFE
                    local8 = $01
                Case $FFFFFFFF
                    local1 = createitem("Metal Panel", $0A, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                Case $00
                    Select arg0\Field6\Field9
                        Case $6D
                            local1 = createitem("AK-74", $81, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        Case $81
                            local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                        Default
                            local5 = $00
                    End Select
                Case $01,$02
                    local79 = rand($01, $64)
                    Select arg0\Field6\Field9
                        Case $72,$6E
                            If (local79 <= $4B) Then
                                local1 = createitem("MP5", $71, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $4B) And (local79 < $5A)) <> 0) Then
                                local1 = createitem("MP7", $77, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $5A) And (local79 < $5F)) <> 0) Then
                                local1 = createitem("P90", $76, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $5F) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $71
                            If (local79 <= $41) Then
                                local1 = createitem("MP7", $77, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $41) And (local79 < $50)) <> 0) Then
                                local1 = createitem("P90", $76, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $50) Then
                                local1 = createitem("KRISS Vector", $73, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $77
                            If (local79 <= $5A) Then
                                local1 = createitem("P90", $76, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $5A) Then
                                local1 = createitem("SR-556", $70, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $73
                            If (local79 <= $3C) Then
                                local1 = createitem("P90", $76, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $3C) And (local79 < $5A)) <> 0) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $5A) Then
                                local1 = createitem("KRISS Vector", $73, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $76
                            If (local79 <= $4B) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $4B) And (local79 < $5F)) <> 0) Then
                                local1 = createitem("SR-556", $70, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $5F) Then
                                local1 = createitem("KRISS Vector", $73, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $6D
                            If (local79 <= $52) Then
                                local1 = createitem("SR-556", $70, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $52) And (local79 < $5C)) <> 0) Then
                                local8 = $01
                            ElseIf (local79 >= $5C) Then
                                local1 = createitem("M60", $6F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $70
                            If (local79 <= $50) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $50) And (local79 < $5A)) <> 0) Then
                                local8 = $01
                            ElseIf (local79 >= $5A) Then
                                local1 = createitem("M60", $6F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $7A
                            If (local79 <= $3C) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (((local79 > $3C) And (local79 < $50)) <> 0) Then
                                local8 = $01
                            ElseIf (((local79 >= $50) And (local79 < $5A)) <> 0) Then
                                local1 = createitem("M60", $6F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $5A) Then
                                local1 = createitem("M134", $79, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $6F
                            If (local79 <= $3C) Then
                                local8 = $01
                            ElseIf (((local79 > $3C) And (local79 < $50)) <> 0) Then
                                local1 = createitem("M4A1", $6D, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            ElseIf (local79 >= $50) Then
                                local1 = createitem("M134", $79, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                        Case $79
                            If (local79 <= $5A) Then
                                local5 = $00
                            ElseIf (local79 >= $5A) Then
                                local1 = createitem("M60", $6F, arg2, arg3, arg4, $00, $00, $00, 1.0, $00)
                            EndIf
                    End Select
            End Select
        Default
            Select arg1
                Case $FFFFFFFE,$FFFFFFFF
                    local8 = $01
                Case $00,$01,$02
                    local5 = $00
            End Select
    End Select
    If (local8 <> 0) Then
        If (XZ6DBZD4ZD <> Null) Then
            removedecal(XZ6DBZD4ZD)
        EndIf
        XZ6DBZD4ZD = createdecal($00, arg2, 0.03625, arg4, 90.0, rnd(360.0, 0.0), 0.0, rnd(0.3, 0.8), rnd(0.8, 1.0), $01, $01, $00, $00, $00)
    EndIf
    If (local5 <> 0) Then
        removeitem(arg0, $01)
    Else
        positionentity(arg0\Field9, arg2, arg3, arg4, $00)
        resetentity(arg0\Field9)
    EndIf
    If (local1 <> Null) Then
        entitytype(local1\Field9, $03, $00)
    EndIf
    Return $00
End Function
