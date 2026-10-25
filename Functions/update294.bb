Function update294%()
    Local local0.items
    Local local1#
    Local local2#
    Local local3%
    Local local4%
    Local local5$
    Local local6%
    Local local7%
    Local local8#
    Local local13%
    Local local14$
    Local local15%
    Local local16.events
    local1 = (Float (TDD0Z6BXB6\Field6 - (imagewidth(X2Z260BF0Z\Field4[$05]) Sar $01)))
    local2 = (Float (TDD0Z6BXB6\Field9 - (imageheight(X2Z260BF0Z\Field4[$05]) Sar $01)))
    local6 = (playerroom\Field8 = $00)
    If (local6 <> 0) Then
        If (TDD0Z6BXB6\Field7 <> 0) Then
            local3 = (Int floor((((mouseposx - local1) - (228.0 * menuscale)) / (35.5 * menuscale))))
            local4 = (Int floor((((mouseposy - local2) - (342.0 * menuscale)) / (36.5 * menuscale))))
            local6 = $00
            If ((((local4 >= $00) And (local4 < $05)) And ((local3 >= $00) And (local3 < $0A))) <> 0) Then
                playsound_strict(buttonsfx[$00], $00, $00)
                local5 = ""
                Select local4
                    Case $00
                        local5 = (Str ((local3 + $01) Mod $0A))
                    Case $01
                        Select local3
                            Case $00
                                local5 = "Q"
                            Case $01
                                local5 = "W"
                            Case $02
                                local5 = "E"
                            Case $03
                                local5 = "R"
                            Case $04
                                local5 = "T"
                            Case $05
                                local5 = "Y"
                            Case $06
                                local5 = "U"
                            Case $07
                                local5 = "I"
                            Case $08
                                local5 = "O"
                            Case $09
                                local5 = "P"
                        End Select
                    Case $02
                        Select local3
                            Case $00
                                local5 = "A"
                            Case $01
                                local5 = "S"
                            Case $02
                                local5 = "D"
                            Case $03
                                local5 = "F"
                            Case $04
                                local5 = "G"
                            Case $05
                                local5 = "H"
                            Case $06
                                local5 = "J"
                            Case $07
                                local5 = "K"
                            Case $08
                                local5 = "L"
                            Case $09
                                local6 = $01
                        End Select
                    Case $03
                        Select local3
                            Case $00
                                local5 = "Z"
                            Case $01
                                local5 = "X"
                            Case $02
                                local5 = "C"
                            Case $03
                                local5 = "V"
                            Case $04
                                local5 = "B"
                            Case $05
                                local5 = "N"
                            Case $06
                                local5 = "M"
                            Case $07
                                local5 = "-"
                            Case $08
                                local5 = " "
                            Case $09
                                i_294\Field1 = left(i_294\Field1, (Int max((Float (len(i_294\Field1) - $01)), 0.0)))
                        End Select
                    Case $04
                        local5 = " "
                End Select
            EndIf
            i_294\Field1 = (i_294\Field1 + local5)
            If ((local6 And (i_294\Field1 <> "")) <> 0) Then
                GUESSEDupdatetxxf_6(i_294\Field1)
                i_294\Field1 = trim(i_294\Field1)
                If (left(i_294\Field1, (Int min(7.0, (Float len(i_294\Field1))))) = "cup of ") Then
                    i_294\Field1 = right(i_294\Field1, (len(i_294\Field1) - $07))
                ElseIf (left(i_294\Field1, (Int min(9.0, (Float len(i_294\Field1))))) = "a cup of ") Then
                    i_294\Field1 = right(i_294\Field1, (len(i_294\Field1) - $09))
                EndIf
                If (_S2IMapContains(i_294\Field3, i_294\Field1) <> 0) Then
                    local13 = _JsonGetArrayValue(i_294\Field0, _S2IMapGet(i_294\Field3, i_294\Field1))
                    If (_JsonIsNull(_JsonGetValue(local13, "dispense_sound")) = $00) Then
                        local14 = _JsonGetString(_JsonGetValue(local13, "dispense_sound"))
                        playerroom\Field8 = playsound_strict(loadtempsound(local14), $00, $00)
                        GUESSEDisentity_10(Null, local14, playerroom\Field27[$00], 10.0, 1.0)
                    EndIf
                    If (XZ0260X8X2\Field63 > $00) Then
                        playsound_strict(loadtempsound("SFX\SCP\294\PullMasterCard.ogg"), $00, $00)
                        GUESSEDisentity_10(Null, "SFX\SCP\294\PullMasterCard.ogg", playerroom\Field27[$00], 2.0, 1.0)
                    EndIf
                    local7 = _JsonGetValue(local13, "explosion")
                    If (_JsonIsNull(local7) = $00) Then
                        If (_JsonGetBool(local7) <> 0) Then
                            XZ0260X8X2\Field33 = 135.0
                            local7 = _JsonGetValue(local13, "death_message")
                            If (_JsonIsNull(local7) = $00) Then
                                msg\Field8 = _JsonGetString(local7)
                            EndIf
                        EndIf
                    EndIf
                    local15 = _JsonGetArray(_JsonGetValue(local13, "color"))
                    local8 = _JsonGetFloat(_JsonGetValue(local13, "alpha"))
                    local7 = _JsonGetValue(local13, "glow")
                    If (_JsonIsNull(local7) = $00) Then
                        If (_JsonGetBool(local7) <> 0) Then
                            local8 = (- local8)
                        EndIf
                    EndIf
                    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
                        local0 = createitem("Cup", $2B, entityx(playerroom\Field27[$02], $01, 1.0), entityy(playerroom\Field27[$02], $01, 1.0), entityz(playerroom\Field27[$02], $01, 1.0), _JsonGetInt(_JsonGetArrayValue(local15, $00)), _JsonGetInt(_JsonGetArrayValue(local15, $01)), _JsonGetInt(_JsonGetArrayValue(local15, $02)), local8, $00)
                        local0\Field19 = i_294\Field1
                        local0\Field24 = format(getlocalstring("items", "cupof"), i_294\Field1, "%s")
                        entitytype(local0\Field9, $03, $00)
                    EndIf
                Else
                    i_294\Field1 = getlocalstring("misc", "ofr")
                    playerroom\Field8 = playsound_strict(loadtempsound("SFX\SCP\294\OutOfRange.ogg"), $00, $00)
                    GUESSEDisentity_10(Null, "SFX\SCP\294\OutOfRange.ogg", playerroom\Field27[$00], 10.0, 1.0)
                EndIf
            EndIf
        EndIf
        If ((TDD0Z6BXB6\Field12 Lor (i_294\Field4 = $00)) <> 0) Then
            i_294\Field4 = $00
            i_294\Field1 = ""
            stopmousemovement()
        EndIf
    Else
        If (i_294\Field1 <> getlocalstring("misc", "ofr")) Then
            i_294\Field1 = getlocalstring("misc", "dispensing")
        EndIf
        If (ChannelPlaying(playerroom\Field8) = $00) Then
            If (i_294\Field1 <> getlocalstring("misc", "ofr")) Then
                i_294\Field4 = $00
                XZ0260X8X2\Field63 = $00
                stopmousemovement()
                For local16 = Each events
                    If (playerroom = local16\Field19) Then
                        local16\Field7 = 0.0
                        Exit
                    EndIf
                Next
            EndIf
            i_294\Field1 = ""
            playerroom\Field8 = $00
        EndIf
    EndIf
    Return $00
End Function
