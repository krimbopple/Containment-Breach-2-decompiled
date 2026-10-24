Function createmap%()
    Local local0.rooms
    Local local1.rooms
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    Local local22%
    Local local26%
    Local local27.roomtemplates
    Local local30#
    Local local31%
    Local local32%
    Local local34#
    Local local35#
    Local local36%
    If (T8X2046020\Field24 > $00) Then
        X824BX6D68 = T8X2046020\Field24
    Else
        X824BX6D68 = $15
    EndIf
    X824BX6D68 = (Int clamp((Float X824BX6D68), 6.0, 28.0))
    i_zone\Field1[$00] = (Int (floor(((Float X824BX6D68) * (1.0 / 1.5))) + 1.0))
    i_zone\Field1[$01] = (Int (floor(((Float X824BX6D68) * (1.0 / 3.0))) + 1.0))
    i_zone\Field0 = $00
    seedrnd(generateseednumber(randomseed))
    Delete currmapgrid
    currmapgrid = (New mapgrid)
    local3 = (X824BX6D68 Sar $01)
    local4 = (X824BX6D68 - $02)
    For local7 = local4 To (X824BX6D68 - $01) Step $01
        currmapgrid\Field4[((local7 * X824BX6D68) + local3)] = $01
    Next
    Repeat
        local8 = (Int floor(((Float X824BX6D68) * 0.6)))
        local10 = rand(local8, (Int floor(((Float X824BX6D68) * 0.85))))
        If (local3 > local8) Then
            local10 = (- local10)
        ElseIf ((Float local3) > floor(((Float X824BX6D68) * 0.4))) Then
            local3 = (local3 - (local10 Sar $01))
        EndIf
        If ((local3 + local10) > (X824BX6D68 - $03)) Then
            local10 = ((X824BX6D68 - $03) - local3)
        ElseIf ((local3 + local10) < $02) Then
            local10 = ((- local3) + $02)
        EndIf
        local3 = (Int min((Float local3), (Float (local3 + local10))))
        local10 = ((local10 Xor (- (local10 < 0))) - (- (local10 < 0)))
        For local7 = local3 To (local3 + local10) Step $01
            currmapgrid\Field4[(Int (min((Float local7), (Float X824BX6D68)) + (Float (local4 * X824BX6D68))))] = $01
        Next
        local11 = rand($03, $04)
        If ((local4 - local11) < $01) Then
            local11 = (local4 - $01)
        EndIf
        local13 = rand($04, $05)
        If (getzone((local4 - local11)) <> getzone(((local4 - local11) + $01))) Then
            local11 = (local11 - $01)
        EndIf
        For local7 = $01 To local13 Step $01
            local8 = (Int clamp((Float rand(local3, ((local3 + local10) - $01))), 2.0, (Float (X824BX6D68 - $02))))
            While (((currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local8)] Lor currmapgrid\Field4[((local8 - $01) + ((local4 - $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local8 + $01) + ((local4 - $01) * X824BX6D68))]) <> 0)
                local8 = (local8 + $01)
            Wend
            If (local8 < (local3 + local10)) Then
                If (local7 = $01) Then
                    local12 = local11
                    If (rand($02, $01) = $01) Then
                        local8 = local3
                    Else
                        local8 = (local3 + local10)
                    EndIf
                Else
                    local12 = rand(local11, $01)
                EndIf
                For local9 = (local4 - local12) To local4 Step $01
                    If (getzone(local9) <> getzone((local9 + $01))) Then
                        currmapgrid\Field4[((local9 * X824BX6D68) + local8)] = $FF
                    Else
                        currmapgrid\Field4[((local9 * X824BX6D68) + local8)] = $01
                    EndIf
                Next
                If (local12 = local11) Then
                    local5 = local8
                EndIf
            EndIf
        Next
        local3 = local5
        local4 = (local4 - local11)
    Until (local4 < $02)
    Dim TXD02FZF04Z%($05, $03)
    For local4 = $01 To (X824BX6D68 - $01) Step $01
        local15 = getzone(local4)
        For local3 = $01 To (X824BX6D68 - $01) Step $01
            If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] > $00) Then
                local5 = $00
                local5 = (Int (((min((Float currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))]), 1.0) + min((Float currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))]), 1.0)) + min((Float currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)]), 1.0)) + min((Float currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)]), 1.0)))
                If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] <> $FF) Then
                    currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = local5
                EndIf
                Select currmapgrid\Field4[((local4 * X824BX6D68) + local3)]
                    Case $01
                        TXD02FZF04Z($00, local15) = (TXD02FZF04Z($00, local15) + $01)
                    Case $02
                        If (2.0 = (min((Float currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))]), 1.0) + min((Float currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))]), 1.0))) Then
                            TXD02FZF04Z($01, local15) = (TXD02FZF04Z($01, local15) + $01)
                        ElseIf (2.0 = (min((Float currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)]), 1.0) + min((Float currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)]), 1.0))) Then
                            TXD02FZF04Z($01, local15) = (TXD02FZF04Z($01, local15) + $01)
                        Else
                            TXD02FZF04Z($02, local15) = (TXD02FZF04Z($02, local15) + $01)
                        EndIf
                    Case $03
                        TXD02FZF04Z($03, local15) = (TXD02FZF04Z($03, local15) + $01)
                    Case $04
                        TXD02FZF04Z($04, local15) = (TXD02FZF04Z($04, local15) + $01)
                End Select
            EndIf
        Next
    Next
    For local7 = $00 To $02 Step $01
        local5 = ((- TXD02FZF04Z($00, local7)) + $05)
        If (local5 > $00) Then
            If (local7 = $02) Then
                local19 = $01
            Else
                local19 = i_zone\Field1[local7]
            EndIf
            If (local7 = $00) Then
                local20 = (X824BX6D68 - $02)
            Else
                local20 = (i_zone\Field1[(local7 - $01)] - $01)
            EndIf
            local21 = $01
            local22 = (X824BX6D68 - $02)
            For local4 = local19 To local20 Step $01
                For local3 = local21 To local22 Step $01
                    If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $00) Then
                        If (1.0 = (((min((Float currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))]), 1.0) + min((Float currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))]), 1.0)) + min((Float currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)]), 1.0)) + min((Float currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)]), 1.0))) Then
                            If (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] <> 0) Then
                                local8 = (local3 + $01)
                                local9 = local4
                            ElseIf (currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] <> 0) Then
                                local8 = (local3 - $01)
                                local9 = local4
                            ElseIf (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] <> 0) Then
                                local8 = local3
                                local9 = (local4 + $01)
                            ElseIf (currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] <> 0) Then
                                local8 = local3
                                local9 = (local4 - $01)
                            EndIf
                            local18 = $00
                            If ((((currmapgrid\Field4[((local9 * X824BX6D68) + local8)] > $01) And (currmapgrid\Field4[((local9 * X824BX6D68) + local8)] < $04)) And (((local4 < local20) Lor (local9 < local4)) Lor (local7 = $00))) <> 0) Then
                                Select currmapgrid\Field4[((local9 * X824BX6D68) + local8)]
                                    Case $02
                                        If (2.0 = (min((Float currmapgrid\Field4[((local8 + $01) + (local9 * X824BX6D68))]), 1.0) + min((Float currmapgrid\Field4[((local8 - $01) + (local9 * X824BX6D68))]), 1.0))) Then
                                            TXD02FZF04Z($01, local7) = (TXD02FZF04Z($01, local7) - $01)
                                            TXD02FZF04Z($03, local7) = (TXD02FZF04Z($03, local7) + $01)
                                            local18 = $01
                                        ElseIf (2.0 = (min((Float currmapgrid\Field4[(((local9 + $01) * X824BX6D68) + local8)]), 1.0) + min((Float currmapgrid\Field4[(((local9 - $01) * X824BX6D68) + local8)]), 1.0))) Then
                                            TXD02FZF04Z($01, local7) = (TXD02FZF04Z($01, local7) - $01)
                                            TXD02FZF04Z($03, local7) = (TXD02FZF04Z($03, local7) + $01)
                                            local18 = $01
                                        EndIf
                                    Case $03
                                        TXD02FZF04Z($03, local7) = (TXD02FZF04Z($03, local7) - $01)
                                        TXD02FZF04Z($04, local7) = (TXD02FZF04Z($04, local7) + $01)
                                        local18 = $01
                                End Select
                                If (local18 <> 0) Then
                                    currmapgrid\Field4[((local9 * X824BX6D68) + local8)] = (currmapgrid\Field4[((local9 * X824BX6D68) + local8)] + $01)
                                    currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $01
                                    TXD02FZF04Z($00, local7) = (TXD02FZF04Z($00, local7) + $01)
                                    local5 = (local5 - $01)
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                    If (local5 = $00) Then
                        Exit
                    EndIf
                Next
                If (local5 = $00) Then
                    Exit
                EndIf
            Next
        EndIf
    Next
    For local7 = $00 To $02 Step $01
        If (local7 = $02) Then
            local19 = $02
        Else
            local19 = i_zone\Field1[local7]
        EndIf
        If (local7 = $00) Then
            local20 = (X824BX6D68 - $02)
        Else
            local20 = (i_zone\Field1[(local7 - $01)] - $02)
        EndIf
        local21 = $01
        local22 = (X824BX6D68 - $02)
        If (TXD02FZF04Z($04, local7) < $02) Then
            local5 = $00
            For local4 = local19 To local20 Step $01
                For local3 = local21 To local22 Step $01
                    If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $03) Then
                        Select $00
                            Case ((((currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] Lor currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 + $02) + (local4 * X824BX6D68))]) Lor (local3 = local22))
                                currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] = $01
                                local5 = $01
                            Case ((((currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] Lor currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 - $02) + (local4 * X824BX6D68))]) Lor (local3 = local21))
                                currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] = $01
                                local5 = $01
                            Case ((((currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] Lor currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))]) Lor currmapgrid\Field4[(((local4 + $02) * X824BX6D68) + local3)]) Lor ((local7 = $00) And (local4 = local20)))
                                currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] = $01
                                local5 = $01
                            Case ((((currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] Lor currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))]) Lor currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))]) Lor currmapgrid\Field4[(((local4 - $02) * X824BX6D68) + local3)]) Lor ((local7 < $02) And (local4 = local19)))
                                currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] = $01
                                local5 = $01
                        End Select
                        If (local5 = $01) Then
                            currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $04
                            TXD02FZF04Z($04, local7) = (TXD02FZF04Z($04, local7) + $01)
                            TXD02FZF04Z($03, local7) = (TXD02FZF04Z($03, local7) - $01)
                            TXD02FZF04Z($00, local7) = (TXD02FZF04Z($00, local7) + $01)
                        EndIf
                    EndIf
                    If (local5 = $01) Then
                        Exit
                    EndIf
                Next
                If (local5 = $01) Then
                    Exit
                EndIf
            Next
        EndIf
        If (TXD02FZF04Z($02, local7) < $02) Then
            local5 = $00
            local4 = local20
            While (local4 >= local19)
                For local3 = local21 To local22 Step $01
                    If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $01) Then
                        Select $01
                            Case (currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] > $00)
                                If (((((currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))] + currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))]) + currmapgrid\Field4[((local3 + $02) + (local4 * X824BX6D68))]) = $00) And (local3 < local22)) <> 0) Then
                                    If ((((currmapgrid\Field4[((local3 + $01) + ((local4 - $02) * X824BX6D68))] + currmapgrid\Field4[((local3 + $02) + ((local4 - $01) * X824BX6D68))]) = $00) And ((local4 > local19) Lor (local7 = $02))) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] = $02
                                        currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    ElseIf ((((currmapgrid\Field4[((local3 + $01) + ((local4 + $02) * X824BX6D68))] + currmapgrid\Field4[((local3 + $02) + ((local4 + $01) * X824BX6D68))]) = $00) And ((local4 < local20) Lor (local7 > $00))) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] = $02
                                        currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    EndIf
                                EndIf
                            Case (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] > $00)
                                If (((((currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))] + currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))]) + currmapgrid\Field4[((local3 - $02) + (local4 * X824BX6D68))]) = $00) And (local3 > local21)) <> 0) Then
                                    If ((((currmapgrid\Field4[((local3 - $01) + ((local4 - $02) * X824BX6D68))] + currmapgrid\Field4[((local3 - $02) + ((local4 - $01) * X824BX6D68))]) = $00) And ((local4 > local19) Lor (local7 = $02))) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] = $02
                                        currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    ElseIf ((((currmapgrid\Field4[((local3 - $01) + ((local4 + $02) * X824BX6D68))] + currmapgrid\Field4[((local3 - $02) + ((local4 + $01) * X824BX6D68))]) = $00) And ((local4 < local20) Lor (local7 > $00))) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] = $02
                                        currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    EndIf
                                EndIf
                            Case (currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] > $00)
                                If (((((currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))] + currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))]) + currmapgrid\Field4[(((local4 + $02) * X824BX6D68) + local3)]) = $00) And ((local4 < local20) Lor (local7 > $00))) <> 0) Then
                                    If ((((currmapgrid\Field4[((local3 - $02) + ((local4 + $01) * X824BX6D68))] + currmapgrid\Field4[((local3 - $01) + ((local4 + $02) * X824BX6D68))]) = $00) And (local3 > local21)) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 - $01) + ((local4 + $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    ElseIf ((((currmapgrid\Field4[((local3 + $02) + ((local4 + $01) * X824BX6D68))] + currmapgrid\Field4[((local3 + $01) + ((local4 + $02) * X824BX6D68))]) = $00) And (local3 < local22)) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 + $01) + ((local4 + $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    EndIf
                                EndIf
                            Case (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] > $00)
                                If (((((currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))] + currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))]) + currmapgrid\Field4[(((local4 - $02) * X824BX6D68) + local3)]) = $00) And ((local4 > local19) Lor (local7 = $02))) <> 0) Then
                                    If ((((currmapgrid\Field4[((local3 - $02) + ((local4 - $01) * X824BX6D68))] + currmapgrid\Field4[((local3 - $01) + ((local4 - $02) * X824BX6D68))]) = $00) And (local3 > local21)) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 - $01) + ((local4 - $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    ElseIf ((((currmapgrid\Field4[((local3 + $02) + ((local4 - $01) * X824BX6D68))] + currmapgrid\Field4[((local3 + $01) + ((local4 - $02) * X824BX6D68))]) = $00) And (local3 < local22)) <> 0) Then
                                        currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] = $02
                                        currmapgrid\Field4[((local3 + $01) + ((local4 - $01) * X824BX6D68))] = $01
                                        local5 = $01
                                    EndIf
                                EndIf
                        End Select
                        If (local5 = $01) Then
                            TXD02FZF04Z($02, local7) = (TXD02FZF04Z($02, local7) + $01)
                            TXD02FZF04Z($01, local7) = (TXD02FZF04Z($01, local7) + $01)
                        EndIf
                    EndIf
                    If (local5 = $01) Then
                        Exit
                    EndIf
                Next
                If (local5 = $01) Then
                    Exit
                EndIf
                local4 = (local4 + $FFFFFFFF)
            Wend
        EndIf
    Next
    local26 = ((TXD02FZF04Z($00, $00) + TXD02FZF04Z($00, $01)) + TXD02FZF04Z($00, $02))
    local26 = (Int max((Float local26), (Float ((TXD02FZF04Z($01, $00) + TXD02FZF04Z($01, $01)) + TXD02FZF04Z($01, $02)))))
    local26 = (Int max((Float local26), (Float ((TXD02FZF04Z($02, $00) + TXD02FZF04Z($02, $01)) + TXD02FZF04Z($02, $02)))))
    local26 = (Int max((Float local26), (Float ((TXD02FZF04Z($03, $00) + TXD02FZF04Z($03, $01)) + TXD02FZF04Z($03, $02)))))
    local26 = (Int max((Float local26), (Float ((TXD02FZF04Z($04, $00) + TXD02FZF04Z($04, $01)) + TXD02FZF04Z($04, $02)))))
    Dim TX62ZBFFBZ4$($05, local26)
    setroom($00, $00, "cont1_173", 0.0)
    setroom($00, $00, "cont1_005", 0.15)
    setroom($00, $00, "room1_storage", 0.35)
    setroom($00, $00, "cont1_914", 0.5)
    setroom($00, $00, "cont1_205", 0.65)
    For local27 = Each roomtemplates
        If (((local27\Field5 And (local27\Field1 = $00)) And (local27\Field11 = $00)) <> 0) Then
            setroom($00, local27\Field3, local27\Field12, local27\Field6)
        EndIf
    Next
    setroom($00, $01, "room2_closets", 0.0)
    setroom($00, $01, "room2_test_lcz", 0.1)
    setroom($00, $01, "cont2_427_714_860_1025", 0.2)
    setroom($00, $01, "room2_storage", 0.3)
    setroom($00, $01, "room2_gw_2", 0.4)
    setroom($00, $01, "cont2_012", 0.5)
    setroom($00, $01, "room2_sl", 0.55)
    setroom($00, $01, "cont2_500_1499", 0.6)
    setroom($00, $01, "room2_closets_2", 0.675)
    setroom($00, $01, "cont2_1123", 0.75)
    setroom($00, $01, "room2_js", 0.85)
    setroom($00, $01, "room2_elevator", 0.9)
    setroom($00, $02, "cont2c_066_1162_arc", 0.0)
    setroom($00, $02, "room2c_gw_lcz", 0.5)
    Select rand($03, $01)
        Case $01
            setroom($00, $03, "room3_storage", 0.2)
            setroom($00, $03, "cont3_513", 0.5)
            setroom($00, $03, "cont3_372", 0.8)
        Case $02
            setroom($00, $03, "cont3_372", 0.2)
            setroom($00, $03, "cont3_513", 0.5)
            setroom($00, $03, "room3_storage", 0.8)
        Case $03
            setroom($00, $03, "cont3_372", 0.2)
            setroom($00, $03, "room3_storage", 0.5)
            setroom($00, $03, "cont3_513", 0.8)
    End Select
    setroom($00, $04, "room4_ic", 0.3)
    setroom($01, $00, "cont1_079", 0.15)
    setroom($01, $00, "cont1_106", 0.3)
    setroom($01, $00, "cont1_035", 0.45)
    setroom($01, $00, "cont1_895", 0.7)
    For local27 = Each roomtemplates
        If (((local27\Field5 And (local27\Field1 = $01)) And (local27\Field11 = $00)) <> 0) Then
            setroom($01, local27\Field3, local27\Field12, local27\Field6)
        EndIf
    Next
    setroom($01, $01, "room2_nuke", 0.1)
    setroom($01, $01, "cont2_409", 0.15)
    setroom($01, $01, "cont2_008", 0.35)
    setroom($01, $01, "room2_tesla_2_hcz", 0.45)
    setroom($01, $01, "room2_shaft", 0.5)
    setroom($01, $01, "cont2_049", 0.6)
    setroom($01, $01, "room2_test_hcz", 0.7)
    setroom($01, $01, "room2_mt", 0.8)
    setroom($01, $01, "room2_servers_hcz", 0.9)
    setroom($01, $02, "cont2c_096", 0.5)
    setroom($01, $03, "cont3_009", 0.2)
    setroom($01, $03, "cont3_966", 0.8)
    setroom($01, $04, "room4_gw", 0.3)
    setroom($02, $00, "gate_b_entrance", 1.0)
    setroom($02, $00, "gate_a_entrance", 1.0)
    setroom($02, $00, "room1_cmr", 1.0)
    setroom($02, $00, "room1_lifts", 0.0)
    For local27 = Each roomtemplates
        If (((local27\Field5 And (local27\Field1 = $02)) And (local27\Field11 = $00)) <> 0) Then
            setroom($02, local27\Field3, local27\Field12, local27\Field6)
        EndIf
    Next
    setroom($02, $01, "room2_scientists", 0.1)
    setroom($02, $01, "room2_cafeteria", 0.2)
    setroom($02, $01, "room2_6_ez", 0.25)
    setroom($02, $01, "room2_office_3", 0.3)
    setroom($02, $01, "room2_servers_ez", 0.4)
    setroom($02, $01, "room2_office", 0.5)
    setroom($02, $01, "room2_office_2", 0.55)
    setroom($02, $01, "cont2_860_1", 0.6)
    setroom($02, $01, "room2_medibay", 0.7)
    setroom($02, $01, "room2_scientists_2", 0.8)
    setroom($02, $01, "room2_ic", 0.9)
    setroom($02, $02, "room2c_ec", 0.0)
    setroom($02, $02, "room2c_2_ez", 0.0)
    setroom($02, $02, "room2c_research", 0.0)
    setroom($02, $03, "room3_2_ez", 0.3)
    setroom($02, $03, "room3_office", 0.5)
    setroom($02, $03, "room3_3_ez", 0.7)
    local5 = $00
    local4 = (X824BX6D68 - $01)
    While (local4 >= $01)
        If (local4 < ((X824BX6D68 / $03) + $01)) Then
            local15 = $03
        ElseIf ((Float local4) < ((Float X824BX6D68) * (1.0 / 1.5))) Then
            local15 = $02
        Else
            local15 = $01
        EndIf
        For local3 = $01 To (X824BX6D68 - $02) Step $01
            If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $FF) Then
                If (local4 > (X824BX6D68 Sar $01)) Then
                    local16 = $28
                Else
                    local16 = $4A
                EndIf
                local0 = createroom(local15, $01, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, 0.0)
                currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                calculateroomextents(local0)
            ElseIf (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] > $00) Then
                local16 = $FFFFFFFF
                local5 = (Int (((min((Float currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))]), 1.0) + min((Float currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))]), 1.0)) + min((Float currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)]), 1.0)) + min((Float currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)]), 1.0)))
                Select local5
                    Case $01
                        If (currmapgrid\Field1[$00] < local26) Then
                            If (TX62ZBFFBZ4($00, currmapgrid\Field1[$00]) <> "") Then
                                local16 = findroomid(TX62ZBFFBZ4($00, currmapgrid\Field1[$00]))
                            EndIf
                        EndIf
                        If (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] <> 0) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $02
                        ElseIf (currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] <> 0) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $03
                        ElseIf (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] <> 0) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $01
                        Else
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $00
                        EndIf
                        local0 = createroom(local15, $00, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                        currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                        currmapgrid\Field1[$00] = (currmapgrid\Field1[$00] + $01)
                    Case $02
                        If (((currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] > $00) And (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] > $00)) <> 0) Then
                            If (currmapgrid\Field1[$01] < local26) Then
                                If (TX62ZBFFBZ4($01, currmapgrid\Field1[$01]) <> "") Then
                                    local16 = findroomid(TX62ZBFFBZ4($01, currmapgrid\Field1[$01]))
                                EndIf
                            EndIf
                            If (rand($02, $01) = $01) Then
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $01
                            Else
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $03
                            EndIf
                            local0 = createroom(local15, $01, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                            currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                            currmapgrid\Field1[$01] = (currmapgrid\Field1[$01] + $01)
                        ElseIf (((currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] > $00) And (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] > $00)) <> 0) Then
                            If (currmapgrid\Field1[$01] < local26) Then
                                If (TX62ZBFFBZ4($01, currmapgrid\Field1[$01]) <> "") Then
                                    local16 = findroomid(TX62ZBFFBZ4($01, currmapgrid\Field1[$01]))
                                EndIf
                            EndIf
                            If (rand($02, $01) = $01) Then
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $02
                            Else
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $00
                            EndIf
                            local0 = createroom(local15, $01, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                            currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                            currmapgrid\Field1[$01] = (currmapgrid\Field1[$01] + $01)
                        Else
                            If (currmapgrid\Field1[$02] < local26) Then
                                If (TX62ZBFFBZ4($02, currmapgrid\Field1[$02]) <> "") Then
                                    local16 = findroomid(TX62ZBFFBZ4($02, currmapgrid\Field1[$02]))
                                EndIf
                            EndIf
                            If (((currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] > $00) And (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] > $00)) <> 0) Then
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $02
                            ElseIf (((currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] > $00) And (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] > $00)) <> 0) Then
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $01
                            ElseIf (((currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] > $00) And (currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] > $00)) <> 0) Then
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $03
                            Else
                                currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $00
                            EndIf
                            local0 = createroom(local15, $02, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                            currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                            currmapgrid\Field1[$02] = (currmapgrid\Field1[$02] + $01)
                        EndIf
                    Case $03
                        If (currmapgrid\Field1[$03] < local26) Then
                            If (TX62ZBFFBZ4($03, currmapgrid\Field1[$03]) <> "") Then
                                local16 = findroomid(TX62ZBFFBZ4($03, currmapgrid\Field1[$03]))
                            EndIf
                        EndIf
                        If (currmapgrid\Field4[(((local4 - $01) * X824BX6D68) + local3)] = $00) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $02
                        ElseIf (currmapgrid\Field4[((local3 - $01) + (local4 * X824BX6D68))] = $00) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $01
                        ElseIf (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] = $00) Then
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $03
                        Else
                            currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = $00
                        EndIf
                        local0 = createroom(local15, $03, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                        currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                        currmapgrid\Field1[$03] = (currmapgrid\Field1[$03] + $01)
                    Case $04
                        If (currmapgrid\Field1[$04] < local26) Then
                            If (TX62ZBFFBZ4($04, currmapgrid\Field1[$04]) <> "") Then
                                local16 = findroomid(TX62ZBFFBZ4($04, currmapgrid\Field1[$04]))
                            EndIf
                        EndIf
                        currmapgrid\Field2[((local4 * X824BX6D68) + local3)] = rand($04, $01)
                        local0 = createroom(local15, $04, ((Float local3) * 8.0), 0.0, ((Float local4) * 8.0), local16, ((Float currmapgrid\Field2[((local4 * X824BX6D68) + local3)]) * 90.0))
                        currmapgrid\Field3[((local4 * X824BX6D68) + local3)] = local0\Field22\Field12
                        currmapgrid\Field1[$04] = (currmapgrid\Field1[$04] + $01)
                End Select
                calculateroomextents(local0)
            EndIf
        Next
        local4 = (local4 + $FFFFFFFF)
    Wend
    If (T8X2046020\Field12 <> 0) Then
        local0 = createroom($00, $00, 216.0, 100.0, 64.0, $72, 0.0)
        calculateroomextents(local0)
    Else
        local0 = createroom($00, $00, 216.0, 100.0, 128.0, $4E, 0.0)
        calculateroomextents(local0)
        local0 = createroom($00, $00, 216.0, 100.0, 64.0, $4C, 0.0)
        calculateroomextents(local0)
    EndIf
    local0 = createroom($00, $00, 216.0, 0.0, 216.0, $6F, 0.0)
    calculateroomextents(local0)
    If (opt\Field3 <> 0) Then
        local0 = createroom($00, $00, 8.0, 250.0, ((Float (X824BX6D68 - $01)) * 8.0), $04, 0.0)
        calculateroomextents(local0)
    EndIf
    local0 = createroom($00, $00, 8.0, 800.0, 0.0, $70, 0.0)
    calculateroomextents(local0)
    local30 = 256.0
    For local27 = Each roomtemplates
        If (local27\Field11 <> 0) Then
            local0 = createroom($00, $00, 216.0, 100.0, local30, local27\Field21, 0.0)
            calculateroomextents(local0)
            local30 = (local30 + 128.0)
        EndIf
    Next
    For local7 = $01 To $0A Step $01
        local31 = $00
        For local0 = Each rooms
            If (preventroomoverlap(local0) <> 0) Then
                local31 = $01
            EndIf
        Next
        If (local31 = $00) Then
            Exit
        EndIf
    Next
    If (opt\Field30 <> 0) Then
        Repeat
            showpointer()
            cls()
            mouseposx = (Float mousex())
            mouseposy = (Float mousey())
            local7 = (X824BX6D68 - $01)
            For local3 = $00 To (X824BX6D68 - $01) Step $01
                For local4 = $00 To (X824BX6D68 - $01) Step $01
                    If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = $00) Then
                        local15 = getzone(local4)
                        local32 = (($32 * local15) + $32)
                        color(local32, local32, local32, $FF)
                        rect((Int ((Float (local7 Shl $05)) * menuscale)), (Int ((Float (local4 Shl $05)) * menuscale)), (Int (30.0 * menuscale)), (Int (30.0 * menuscale)), $01)
                    Else
                        Select currmapgrid\Field4[((local4 * X824BX6D68) + local3)]
                            Case $FF
                                color($00, $C8, $00, $FF)
                            Case $04
                                color($32, $32, $FF, $FF)
                            Case $03
                                color($32, $FF, $FF, $FF)
                            Case $02
                                color($FF, $FF, $32, $FF)
                            Case $01
                                color($FF, $FF, $FF, $FF)
                        End Select
                        rect((Int ((Float (local7 Shl $05)) * menuscale)), (Int ((Float (local4 Shl $05)) * menuscale)), (Int (30.0 * menuscale)), (Int (30.0 * menuscale)), $01)
                        If (mouseon((Int ((Float (local7 Shl $05)) * menuscale)), (Int ((Float (local4 Shl $05)) * menuscale)), (Int (32.0 * menuscale)), (Int (32.0 * menuscale))) <> 0) Then
                            color($FF, $00, $00, $FF)
                            textex((Int ((Float ((local7 Shl $05) + $02)) * menuscale)), (Int ((Float ((local4 Shl $05) + $02)) * menuscale)), (((Str currmapgrid\Field4[((local4 * X824BX6D68) + local3)]) + " ") + currmapgrid\Field3[((local4 * X824BX6D68) + local3)]), $00, $00)
                        EndIf
                    EndIf
                Next
                local7 = (local7 - $01)
            Next
            color($FF, $FF, $FF, $FF)
            textex((Int (6.0 * menuscale)), (Int (12.0 * menuscale)), (Str currmapgrid\Field1[$00]), $00, $00)
            color($FF, $FF, $32, $FF)
            textex((Int (6.0 * menuscale)), (Int (44.0 * menuscale)), (Str currmapgrid\Field1[$01]), $00, $00)
            color($FF, $32, $32, $FF)
            textex((Int (6.0 * menuscale)), (Int (76.0 * menuscale)), (Str currmapgrid\Field1[$02]), $00, $00)
            color($32, $FF, $FF, $FF)
            textex((Int (6.0 * menuscale)), (Int (108.0 * menuscale)), (Str currmapgrid\Field1[$03]), $00, $00)
            color($32, $32, $FF, $FF)
            textex((Int (6.0 * menuscale)), (Int (140.0 * menuscale)), (Str currmapgrid\Field1[$04]), $00, $00)
            color($FF, $FF, $FF, $FF)
            textex(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (15.0 * menuscale))), format(getlocalstring("menu", "new.seed2"), randomseed, "%s"), $01, $01)
            renderloadingtext(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (35.0 * menuscale))), getlocalstring("menu", "anykey"), $01, $01)
            flip($01)
            rendercursor()
        Until (((getkey() <> $00) Lor mousehit($01)) <> 0)
    EndIf
    For local4 = $00 To X824BX6D68 Step $01
        For local3 = $00 To X824BX6D68 Step $01
            currmapgrid\Field4[((local4 * X824BX6D68) + local3)] = (Int min((Float currmapgrid\Field4[((local4 * X824BX6D68) + local3)]), 1.0))
        Next
    Next
    local4 = X824BX6D68
    While (local4 >= $00)
        If (local4 < (i_zone\Field1[$01] - $01)) Then
            local15 = $03
        ElseIf (((local4 >= (i_zone\Field1[$01] - $01)) And (local4 < (i_zone\Field1[$00] - $01))) <> 0) Then
            local15 = $02
        Else
            local15 = $01
        EndIf
        local3 = X824BX6D68
        While (local3 >= $00)
            If (currmapgrid\Field4[((local4 * X824BX6D68) + local3)] > $00) Then
                local34 = ((Float local3) * 8.0)
                local35 = ((Float local4) * 8.0)
                local36 = (((local15 - $01) Mod $02) Shl $01)
                For local0 = Each rooms
                    local0\Field21 = (Int wrapangle((Float local0\Field21), 360.0))
                    If ((((Int (local0\Field40 / 8.0)) = local3) And ((Int (local0\Field37 / 8.0)) = local4)) <> 0) Then
                        Select local0\Field22\Field3
                            Case $00
                                local14 = (90.0 = (Float local0\Field21))
                            Case $01
                                local14 = ((90.0 = (Float local0\Field21)) Lor (270.0 = (Float local0\Field21)))
                            Case $02
                                local14 = ((0.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local14 = (((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21))) Lor (90.0 = (Float local0\Field21)))
                            Default
                                local14 = $01
                        End Select
                        If (local14 <> 0) Then
                            If ((local3 + $01) < (X824BX6D68 + $01)) Then
                                If (currmapgrid\Field4[((local3 + $01) + (local4 * X824BX6D68))] > $00) Then
                                    local0\Field10[$00] = createdoor(local0, (local34 + 4.0), 0.0, local35, 90.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), local36, $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Select local0\Field22\Field3
                            Case $00
                                local14 = (180.0 = (Float local0\Field21))
                            Case $01
                                local14 = ((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21)))
                            Case $02
                                local14 = ((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local14 = (((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21))) Lor (270.0 = (Float local0\Field21)))
                            Default
                                local14 = $01
                        End Select
                        If (local14 <> 0) Then
                            If ((local4 + $01) < (X824BX6D68 + $01)) Then
                                If (currmapgrid\Field4[(((local4 + $01) * X824BX6D68) + local3)] > $00) Then
                                    local0\Field10[$03] = createdoor(local0, local34, 0.0, (local35 + 4.0), 0.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), local36, $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Exit
                    EndIf
                Next
            EndIf
            local3 = (local3 + $FFFFFFFF)
        Wend
        local4 = (local4 + $FFFFFFFF)
    Wend
    For local0 = Each rooms
        local0\Field21 = (Int wrapangle((Float local0\Field21), 360.0))
        For local7 = $00 To $03 Step $01
            local0\Field29[local7] = Null
        Next
        For local1 = Each rooms
            If (((local0 <> local1) And isequal(local0\Field3, local1\Field3, 0.001)) <> 0) Then
                If (local0\Field37 = local1\Field37) Then
                    If ((local0\Field40 + 8.0) = local1\Field40) Then
                        local0\Field29[$00] = local1
                        If (local0\Field10[$00] = Null) Then
                            local0\Field10[$00] = local1\Field10[$02]
                        EndIf
                    ElseIf ((local0\Field40 - 8.0) = local1\Field40) Then
                        local0\Field29[$02] = local1
                        If (local0\Field10[$02] = Null) Then
                            local0\Field10[$02] = local1\Field10[$00]
                        EndIf
                    EndIf
                ElseIf (local0\Field40 = local1\Field40) Then
                    If ((local0\Field37 - 8.0) = local1\Field37) Then
                        local0\Field29[$01] = local1
                        If (local0\Field10[$01] = Null) Then
                            local0\Field10[$01] = local1\Field10[$03]
                        EndIf
                    ElseIf ((local0\Field37 + 8.0) = local1\Field37) Then
                        local0\Field29[$03] = local1
                        If (local0\Field10[$03] = Null) Then
                            local0\Field10[$03] = local1\Field10[$01]
                        EndIf
                    EndIf
                EndIf
            EndIf
            If (((((local0\Field29[$00] <> Null) And (local0\Field29[$01] <> Null)) And (local0\Field29[$02] <> Null)) And (local0\Field29[$03] <> Null)) <> 0) Then
                Exit
            EndIf
        Next
    Next
    Return $00
End Function
