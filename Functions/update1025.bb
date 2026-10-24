Function update1025%()
    Local local0%
    Local local3%
    For local0 = $00 To $06 Step $01
        If (0.0 < i_1025\Field0[local0]) Then
            Select local0
                Case $00
                    updatecough($3E8)
                    XZ0260X8X2\Field56 = (XZ0260X8X2\Field56 - (fps\Field3[$00] * 0.2))
                Case $01
                    If (rand($2328, $01) = $01) Then
                        createmsg(getlocalstring("msg", "skinitchy"), 6.0)
                    EndIf
                Case $02
                    updatecough($320)
                    If (((0.0 < XZ0260X8X2\Field76) And keydown(key\Field12)) <> 0) Then
                        XZ0260X8X2\Field56 = (XZ0260X8X2\Field56 - (fps\Field3[$00] * 0.3))
                    EndIf
                Case $03
                    If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                        i_1025\Field0[local0] = (i_1025\Field0[local0] + (fps\Field3[$00] * 0.0005))
                    EndIf
                    If (20.0 < i_1025\Field0[local0]) Then
                        If (20.0 >= (i_1025\Field0[local0] - fps\Field3[$00])) Then
                            createmsg(getlocalstring("msg", "stomachunbearable"), 6.0)
                        EndIf
                        XZ0260X8X2\Field56 = (XZ0260X8X2\Field56 - (fps\Field3[$00] * 0.3))
                    ElseIf (10.0 < i_1025\Field0[local0]) Then
                        If (10.0 >= (i_1025\Field0[local0] - fps\Field3[$00])) Then
                            createmsg(getlocalstring("msg", "stomachaching"), 6.0)
                        EndIf
                    EndIf
                Case $04
                    If (35.0 > XZ0260X8X2\Field56) Then
                        updatecough((Int ((XZ0260X8X2\Field56 * 8.0) + 140.0)))
                        XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, ((XZ0260X8X2\Field56 * 15.0) + 10.0))
                    EndIf
                Case $05
                    If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                        i_1025\Field0[local0] = (i_1025\Field0[local0] + (fps\Field3[$00] * 0.35))
                    EndIf
                    If (110.0 < i_1025\Field0[local0]) Then
                        XZ0260X8X2\Field62 = 0.0
                        XZ0260X8X2\Field64 = max(XZ0260X8X2\Field64, 500.0)
                        If (140.0 < i_1025\Field0[local0]) Then
                            msg\Field8 = getlocalstring("death", "1025")
                            kill($00, $01, $00, $01)
                        EndIf
                    Else
                        XZ0260X8X2\Field62 = max(XZ0260X8X2\Field62, (i_1025\Field0[local0] + 70.0))
                        XZ0260X8X2\Field87 = 1.0
                    EndIf
                Case $06
                    If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                        i_1025\Field0[local0] = (i_1025\Field0[local0] + (fps\Field3[$00] / 70.0))
                    EndIf
                    If (75.0 > i_1025\Field0[local0]) Then
                        If (((15.0 < i_1025\Field0[local0]) And (i_714\Field0 = $00)) <> 0) Then
                            XZ0260X8X2\Field56 = min(100.0, (((((i_1025\Field0[local0] / 17500.0) + 0.001) * (100.0 - XZ0260X8X2\Field56)) * fps\Field3[$00]) + XZ0260X8X2\Field56))
                        EndIf
                    Else
                        XZ0260X8X2\Field65 = max(XZ0260X8X2\Field65, 1.2)
                        XZ0260X8X2\Field34 = 14.0
                    EndIf
                    If (100.0 < i_1025\Field0[local0]) Then
                        i_1025\Field0[local0] = 1.0
                    EndIf
                    If (((15.0 < i_1025\Field0[local0]) And (15.0 >= (i_1025\Field0[local0] - fps\Field3[$00]))) <> 0) Then
                        createmsg(getlocalstring("msg", "energetic"), 6.0)
                    EndIf
            End Select
        EndIf
    Next
    For local0 = $01 To $02 Step $01
        If (0.0 < i_1025\Field1[local0]) Then
            Select local0
                Case $01
                    If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                        local3 = (Int ((Float rand($28, $32)) * 70.0))
                        If (15.0 < i_1025\Field1[local0]) Then
                            i_1025\Field1[local0] = (i_1025\Field1[local0] + fps\Field3[$00])
                            If ((Float local3) < i_1025\Field1[local0]) Then
                                i_1025\Field1[local0] = 1.0
                            EndIf
                        ElseIf (rand($28, $01) = $01) Then
                            i_1025\Field1[local0] = (i_1025\Field1[local0] + 1.0)
                            Select rand($08, $01)
                                Case $01,$02,$03,$05
                                    XZ0260X8X2\Field53 = -10.0
                                Case $04,$05,$06
                                    XZ0260X8X2\Field1 = rnd(0.5, 2.0)
                                Case $07,$08
                                    playsound_strict(loadtempsound((("SFX\SCP\294\Retch" + (Str rand($00, $01))) + ".ogg")), $00, $00)
                                    XZ0260X8X2\Field68 = max(6.0, XZ0260X8X2\Field68)
                            End Select
                        EndIf
                    EndIf
                Case $02
                    If (i_714\Field0 = $00) Then
                        XZ0260X8X2\Field6 = 50.0
                        XZ0260X8X2\Field56 = curvevalue(min(XZ0260X8X2\Field6, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 20.0)
                    EndIf
                    If (25.0 > XZ0260X8X2\Field56) Then
                        XZ0260X8X2\Field42 = curvevalue(-450.0, XZ0260X8X2\Field42, 15.0)
                    EndIf
            End Select
        EndIf
    Next
    Return $00
End Function
