Function updatemoving%()
    Local local0.TX2BF6X0FF4
    Local local1.decals
    Local local2#
    Local local3#
    Local local4%
    Local local5%
    Local local6#
    Local local7%
    Local local8#
    Local local9%
    Local local10$
    Local local11%
    Local local12#
    Local local13#
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20.X44ZF6442X
    Local local21#
    Local local22%
    Local local23#
    Local local24#
    Local local25#
    Local local26#
    Local local27#
    Local local28%
    Local local29%
    Local local30#
    Local local31#
    Local local32#
    Local local33#
    Local local34%
    Local local35#
    catcherrors("UpdateMoving()")
    local0 = TXXF6F02DB2[GUESSEDupdatedropitem()]
    local2 = 1.0
    local3 = 0.018
    If (entityhidden(X2Z260BF0Z\Field1[$00]) = $00) Then
        If (((opt\Field23 = $00) Lor ((isplayeroutsidefacility() Lor (playerroom\Field22\Field7 = $04)) Lor (((forest_event <> Null) And (forest_event\Field19 = playerroom)) And (1.0 = forest_event\Field4)))) <> 0) Then
            hideentity(X2Z260BF0Z\Field1[$00])
        EndIf
    EndIf
    If (chs\Field1 <> 0) Then
        cansave = $00
        local3 = (local3 * 3.0)
        chs\Field3 = (chs\Field3 + fps\Field3[$00])
        XZ0260X8X2\Field1 = (sin((chs\Field3 / 5.0)) * (chs\Field3 / 1500.0))
        If (3500.0 < chs\Field3) Then
            msg\Field8 = getlocalstring("death", "superman")
            kill($00, $01, $00, $01)
            If ((entityhidden(X2Z260BF0Z\Field1[$00]) And opt\Field23) <> 0) Then
                showentity(X2Z260BF0Z\Field1[$00])
            EndIf
        Else
            XZ0260X8X2\Field64 = 500.0
            If (entityhidden(X2Z260BF0Z\Field1[$00]) = $00) Then
                hideentity(X2Z260BF0Z\Field1[$00])
            EndIf
        EndIf
    EndIf
    If (0.0 < XZ0260X8X2\Field26) Then
        cansave = $00
        XZ0260X8X2\Field26 = (XZ0260X8X2\Field26 - fps\Field3[$00])
        If (1.0 > XZ0260X8X2\Field26) Then
            XZ0260X8X2\Field26 = -1.0
        EndIf
    ElseIf (0.0 > XZ0260X8X2\Field26) Then
        kill($00, $01, $00, $01)
        XZ0260X8X2\Field26 = 0.0
    EndIf
    If (0.0 < XZ0260X8X2\Field34) Then
        XZ0260X8X2\Field34 = max(0.0, (XZ0260X8X2\Field34 - (fps\Field3[$00] / 70.0)))
    Else
        XZ0260X8X2\Field65 = 1.0
    EndIf
    If (0.0 < i_966\Field0) Then
        i_966\Field0 = (i_966\Field0 - (((Float (i_427\Field2 * (25200.0 > i_427\Field1))) + 1.0) * fps\Field3[$00]))
    Else
        i_966\Field1 = 0.0
    EndIf
    If ((((0.0 = XZ0260X8X2\Field48) And (chs\Field7 = $00)) And ((keydown(key\Field12) And (invopen = $00)) And (otheropen = Null))) <> 0) Then
        If (5.0 > XZ0260X8X2\Field56) Then
            If (ChannelPlaying(breathchn) = $00) Then
                local7 = $00
                If ((((T8660BZ460\Field3 > $00) Lor (i_1499\Field8 > $00)) Lor (T8660BZ460\Field10 > $00)) <> 0) Then
                    local7 = $01
                EndIf
                breathchn = playsound_strict(TFB8222B2X(local7, $00), $01, $00)
            EndIf
        ElseIf (40.0 > XZ0260X8X2\Field56) Then
            If (ChannelPlaying(breathchn) = $00) Then
                local7 = $00
                If ((((T8660BZ460\Field3 > $00) Lor (i_1499\Field8 > $00)) Lor (T8660BZ460\Field10 > $00)) <> 0) Then
                    local7 = $01
                EndIf
                breathchn = playsound_strict(TFB8222B2X(local7, rand($03, $01)), $01, $01)
                ChannelVolume(breathchn, ((min(((70.0 - XZ0260X8X2\Field56) / 70.0), 1.0) * opt\Field59) * opt\Field2))
                ResumeChannel(breathchn)
            EndIf
        EndIf
    EndIf
    If (XZ0260X8X2\Field23 <> 0) Then
        If (XZ0260X8X2\Field25 <> 0) Then
            setcrouch($00)
        EndIf
    EndIf
    If (0.001 > (Abs (XZ0260X8X2\Field46 - (Float XZ0260X8X2\Field25)))) Then
        XZ0260X8X2\Field46 = (Float XZ0260X8X2\Field25)
    Else
        XZ0260X8X2\Field46 = curvevalue((Float XZ0260X8X2\Field25), XZ0260X8X2\Field46, 10.0)
    EndIf
    local11 = $00
    local12 = 1.0
    local13 = 1.0
    local14 = $00
    local15 = $00
    local16 = $00
    local17 = $00
    local18 = $00
    local19 = (GUESSEDupdatexdb() = $00)
    local21 = 1.0
    If (local0 <> Null) Then
        If (0.0 >= local0\Field28) Then
            If (XZ0260X8X2\Field25 = $00) Then
                local0\Field20 = $01
            Else
                local0\Field20 = $04
            EndIf
        EndIf
        If (TXDFXDZXXDD\Field12 <> 0) Then
            local11 = $01
        EndIf
        local20 = local0\Field55\Field5
        If (local20 <> Null) Then
            If (0.0 <> local20\Field44) Then
                local12 = local20\Field44
            EndIf
            If (0.0 <> local20\Field16) Then
                local13 = local20\Field16
            EndIf
            local14 = (len(local20\Field49) > $00)
            If (local20\Field58[$04] = $00) Then
                local16 = $01
            EndIf
            local10 = local20\Field41
            local15 = local20\Field0
            local17 = local20\Field33
            local19 = local20\Field27
            If (ChannelPlaying(local0\Field55\Field0) = $00) Then
                local0\Field55\Field0 = $00
                If (local0\Field55\Field5\Field40 > $00) Then
                    local22 = rand($00, (local0\Field55\Field5\Field40 - $01))
                    If (local0\Field55\Field5\Field48[local22] <> 0) Then
                        local0\Field55\Field0 = playsoundex(local0\Field55\Field5\Field10[local22], camera, local0\Field55\Field7, 8.0, 1.0, $00, $00)
                    EndIf
                EndIf
            Else
                updatesoundorigin(local0\Field55\Field0, camera, local0\Field55\Field7, 8.0, 1.0, $00, $01, $00)
            EndIf
        EndIf
        If (0.0 <> TXDFXDZXXDD\Field8) Then
            local12 = (TXDFXDZXXDD\Field8 * local12)
        EndIf
        If (0.0 <> TXDFXDZXXDD\Field11) Then
            local13 = (TXDFXDZXXDD\Field11 * local13)
        EndIf
        If (0.0 < TXDFXDZXXDD\Field17) Then
            XZ0260X8X2\Field21 = TXDFXDZXXDD\Field17
            XZ0260X8X2\Field0 = TXDFXDZXXDD\Field6
            local18 = $01
        EndIf
        If (0.0 <> TXDFXDZXXDD\Field14) Then
            local21 = TXDFXDZXXDD\Field14
        EndIf
    EndIf
    local23 = 0.0
    entitykinematic(XZ0260X8X2\Field74, chs\Field7)
    local24 = angledist(entityyaw(XZ0260X8X2\Field74, $01, 1.0), XZ0260X8X2\Field24)
    XZ0260X8X2\Field24 = entityyaw(XZ0260X8X2\Field74, $01, 1.0)
    If ((((local11 = $00) And ((((d_i\Field3 <> Null) Lor (selectedscreen <> Null)) Lor i_294\Field4) = $00)) And (((((menuopen Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) And (GUESSEDupdatexdb() <> $00)) = $00)) <> 0) Then
        If (chs\Field7 = $00) Then
            If (((((XZ0260X8X2\Field38 = $02) And (0.0 <= XZ0260X8X2\Field52)) And (0.0 = XZ0260X8X2\Field48)) And (-0.07 < XZ0260X8X2\Field16)) <> 0) Then
                If ((((keydown(key\Field16) Xor keydown(key\Field5)) Lor (keydown(key\Field6) Xor keydown(key\Field7))) Lor (0.0 < XZ0260X8X2\Field21)) <> 0) Then
                    If (((((XZ0260X8X2\Field25 = $00) And (XZ0260X8X2\Field23 = $00)) And ((keydown(key\Field12) And (invopen = $00)) And (otheropen = Null))) And (0.0 < XZ0260X8X2\Field56)) <> 0) Then
                        XZ0260X8X2\Field56 = (XZ0260X8X2\Field56 - ((((((i_966\Field1 + ((Float (70.0 < XZ0260X8X2\Field70)) * 0.5)) * 0.28) + 0.28) * fps\Field3[$00]) * XZ0260X8X2\Field65) * local13))
                        If (0.0 >= XZ0260X8X2\Field56) Then
                            XZ0260X8X2\Field56 = -20.0
                        EndIf
                        local2 = 2.5
                        If (((local0 <> Null) And (0.0 >= local0\Field28)) <> 0) Then
                            local0\Field20 = $03
                        EndIf
                    ElseIf (((local0 <> Null) And (0.0 >= local0\Field28)) <> 0) Then
                        If (XZ0260X8X2\Field25 = $00) Then
                            local0\Field20 = $02
                        Else
                            local0\Field20 = $05
                        EndIf
                    EndIf
                    If (playerroom\Field22\Field21 = $6F) Then
                        If (((pd_event <> Null) And (5.0 <> pd_event\Field7)) <> 0) Then
                            local3 = 0.015
                            XZ0260X8X2\Field56 = max((XZ0260X8X2\Field56 - (fps\Field3[$00] * 0.35)), -20.0)
                        EndIf
                    EndIf
                    If (((invopen Lor (otheropen <> Null)) Lor (TX4F400F244 <> Null)) <> 0) Then
                        local3 = (local3 * 0.5)
                    EndIf
                    If (0.0 < XZ0260X8X2\Field21) Then
                        local3 = (XZ0260X8X2\Field21 * local3)
                    EndIf
                    If (selecteditem <> Null) Then
                        If ((((((selecteditem\Field6\Field9 = $34) Lor (selecteditem\Field6\Field9 = $36)) Lor (selecteditem\Field6\Field9 = $35)) And (invopen = $00)) And (T8660BZ460\Field10 = $00)) <> 0) Then
                            local2 = 0.0
                        EndIf
                    EndIf
                    local8 = (XZ0260X8X2\Field15 Mod 360.0)
                    If (-2.0 < XZ0260X8X2\Field22) Then
                        XZ0260X8X2\Field15 = ((((fps\Field3[$00] * min(local2, 1.5)) * 7.0) + XZ0260X8X2\Field15) Mod 720.0)
                        If ((((180.0 > local8) And (180.0 <= (XZ0260X8X2\Field15 Mod 360.0))) And (local14 = $00)) <> 0) Then
                            If (local10 <> "") Then
                                GUESSEDupdatemoving(_SplitString(local20\Field41, " ", rand($00, (Int max((Float (_CountSplitString(local20\Field41, " ") - $01)), 0.0)))), 0.8)
                            Else
                                playstepsound((2.5 = local2))
                            EndIf
                        EndIf
                    EndIf
                EndIf
                If (((((keyhit(key\Field4) And (XZ0260X8X2\Field23 = $00)) And (60.0 >= XZ0260X8X2\Field39)) And (27300.0 > i_427\Field1)) And ((selecteditem = Null) Lor (((selecteditem\Field6\Field9 <> $34) And (selecteditem\Field6\Field9 <> $36)) And (selecteditem\Field6\Field9 <> $35)))) <> 0) Then
                    setcrouch((XZ0260X8X2\Field25 = $00))
                EndIf
            EndIf
        ElseIf (((keydown(key\Field12) And (invopen = $00)) And (otheropen = Null)) <> 0) Then
            local2 = 2.5
        ElseIf (keydown(key\Field4) <> 0) Then
            local2 = 0.5
        EndIf
        local3 = (local3 * local12)
        local25 = ((local3 * local2) / (XZ0260X8X2\Field46 + 1.0))
        If (chs\Field7 <> 0) Then
            XZ0260X8X2\Field15 = 0.0
            XZ0260X8X2\Field76 = 0.0
            setcrouch($00)
            rotateentity(XZ0260X8X2\Field74, entitypitch(camera, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), entityroll(camera, $00, 1.0), $00)
            local25 = (chs\Field5 * local25)
            If (keydown(key\Field16) <> 0) Then
                moveentity(XZ0260X8X2\Field74, 0.0, 0.0, (fps\Field3[$00] * (- local25)), $00)
            EndIf
            If (keydown(key\Field5) <> 0) Then
                moveentity(XZ0260X8X2\Field74, 0.0, 0.0, (fps\Field3[$00] * local25), $00)
            EndIf
            If (keydown(key\Field7) <> 0) Then
                moveentity(XZ0260X8X2\Field74, (fps\Field3[$00] * (- local25)), 0.0, 0.0, $00)
            EndIf
            If (keydown(key\Field6) <> 0) Then
                moveentity(XZ0260X8X2\Field74, (fps\Field3[$00] * local25), 0.0, 0.0, $00)
            EndIf
            rotateentity(XZ0260X8X2\Field74, 0.0, entityyaw(XZ0260X8X2\Field74, $00, 1.0), 0.0, $00)
        Else
            If (local17 = $00) Then
                local25 = (local25 / max((((((XZ0260X8X2\Field11 / 4.0) - (Float ((GUESSEDupdatexdb() = $00) * $03))) + 3.0) - ((Float (0.0 < i_1025\Field1[$03])) * 2.25)) / 3.0), 1.0))
                If (0.5 < XZ0260X8X2\Field11) Then
                    local25 = (min((sin((XZ0260X8X2\Field15 / 2.0)) + 1.2), 1.0) * local25)
                EndIf
            EndIf
            local8 = 0.0
            If ((((XZ0260X8X2\Field38 = $02) And (0.0 <= XZ0260X8X2\Field52)) And (0.0 = XZ0260X8X2\Field48)) <> 0) Then
                local9 = ((menuopen = $00) And keyhit(key\Field3))
                If (XZ0260X8X2\Field23 = $00) Then
                    If ((((keydown(key\Field12) = $00) And (invopen = $00)) And (otheropen = Null)) <> 0) Then
                        If (keydown(key\Field19) <> 0) Then
                            If (keydown(key\Field18) = $00) Then
                                local23 = 15.0
                            EndIf
                        ElseIf (keydown(key\Field18) <> 0) Then
                            local23 = -15.0
                        EndIf
                    EndIf
                    If (keydown(key\Field16) <> 0) Then
                        If (keydown(key\Field5) = $00) Then
                            local8 = 1.0
                            local6 = 180.0
                            If (keydown(key\Field7) <> 0) Then
                                If (keydown(key\Field6) = $00) Then
                                    local6 = 135.0
                                EndIf
                            ElseIf (keydown(key\Field6) <> 0) Then
                                local6 = -135.0
                            EndIf
                        ElseIf (keydown(key\Field7) <> 0) Then
                            If (keydown(key\Field6) = $00) Then
                                local8 = 1.0
                                local6 = 90.0
                            EndIf
                        ElseIf (keydown(key\Field6) <> 0) Then
                            local8 = 1.0
                            local6 = -90.0
                        EndIf
                    ElseIf (keydown(key\Field5) <> 0) Then
                        local8 = 1.0
                        local6 = 0.0
                        If (keydown(key\Field7) <> 0) Then
                            If (keydown(key\Field6) = $00) Then
                                local6 = 45.0
                            EndIf
                        ElseIf (keydown(key\Field6) <> 0) Then
                            local6 = -45.0
                        EndIf
                    ElseIf (0.0 < XZ0260X8X2\Field21) Then
                        local8 = 1.0
                        local6 = XZ0260X8X2\Field0
                    ElseIf (keydown(key\Field7) <> 0) Then
                        If (keydown(key\Field6) = $00) Then
                            local8 = 1.0
                            local6 = 90.0
                        EndIf
                    ElseIf (keydown(key\Field6) <> 0) Then
                        local8 = 1.0
                        local6 = -90.0
                    EndIf
                    If (local18 <> 0) Then
                        local8 = 1.0
                        local6 = XZ0260X8X2\Field0
                    EndIf
                Else
                    local8 = 1.0
                    local6 = XZ0260X8X2\Field0
                EndIf
                If ((((((local19 = $00) And local9) And (0.0 < XZ0260X8X2\Field22)) And (5.0 <= XZ0260X8X2\Field56)) And T8X2046020\Field3) <> 0) Then
                    XZ0260X8X2\Field75 = wrapangle(((entityyaw(XZ0260X8X2\Field74, $01, 1.0) + local6) + 90.0), 360.0)
                    XZ0260X8X2\Field16 = 0.051
                    XZ0260X8X2\Field18 = 10.0
                    XZ0260X8X2\Field56 = max((XZ0260X8X2\Field56 - (XZ0260X8X2\Field65 * 5.0)), -20.0)
                    XZ0260X8X2\Field76 = (XZ0260X8X2\Field76 + (local25 * 0.02))
                    XZ0260X8X2\Field5 = 1.0
                Else
                    If (local18 = $00) Then
                        local6 = wrapangle(((entityyaw(XZ0260X8X2\Field74, $01, 1.0) + local6) + 90.0), 360.0)
                    EndIf
                    If (-2.0 < XZ0260X8X2\Field22) Then
                        XZ0260X8X2\Field75 = local6
                        entitylinearvelocity(XZ0260X8X2\Field74, (((cos(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0), 0.0, (((sin(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0))
                        If ((Int local8) <> 0) Then
                            XZ0260X8X2\Field76 = curvevalue(local25, XZ0260X8X2\Field76, 20.0)
                        Else
                            XZ0260X8X2\Field76 = max(curvevalue(0.0, (XZ0260X8X2\Field76 - 0.1), 1.0), 0.0)
                        EndIf
                    Else
                        XZ0260X8X2\Field75 = wrapangle((XZ0260X8X2\Field75 + local24), 360.0)
                    EndIf
                EndIf
            Else
                entitylinearvelocity(XZ0260X8X2\Field74, (((cos(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0), ((XZ0260X8X2\Field16 * fps\Field3[$00]) * 105.0), (((sin(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0))
                XZ0260X8X2\Field76 = max(curvevalue(0.0, (XZ0260X8X2\Field76 - 0.1), 1.0), 0.0)
            EndIf
        EndIf
        XZ0260X8X2\Field21 = 0.0
    ElseIf (0.0 < XZ0260X8X2\Field22) Then
        XZ0260X8X2\Field76 = max(curvevalue(0.0, (XZ0260X8X2\Field76 - 0.1), 1.0), 0.0)
    EndIf
    If (((local20 <> Null) And (local20\Field4 <> $00)) <> 0) Then
        local26 = (((Float (0.01 < XZ0260X8X2\Field76)) * 0.8) * local8)
        TXDFXDZXXDD\Field4 = loopsoundlocal(local20\Field4, TXDFXDZXXDD\Field4, (local26 * 0.8), $00)
    EndIf
    If (local16 <> 0) Then
        XZ0260X8X2\Field25 = $00
    EndIf
    XZ0260X8X2\Field58 = curvevalue(local23, XZ0260X8X2\Field58, (((Float (3.0 < XZ0260X8X2\Field11)) * 6.0) + 6.0))
    XZ0260X8X2\Field18 = (XZ0260X8X2\Field18 - fps\Field3[$00])
    If (chs\Field7 = $00) Then
        local27 = (XZ0260X8X2\Field19 - entityy(XZ0260X8X2\Field74, $01, 1.0))
        local28 = $00
        local29 = countcollisions(XZ0260X8X2\Field74)
        For local5 = $01 To local29 Step $01
            If (collisiony(XZ0260X8X2\Field74, local5) < (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.25)) Then
                local28 = $01
                Exit
            EndIf
        Next
        If ((local28 And (0.0 >= XZ0260X8X2\Field18)) <> 0) Then
            If (((0.05 <= (Abs XZ0260X8X2\Field16)) Lor (-15.0 > XZ0260X8X2\Field22)) <> 0) Then
                If (local14 = $00) Then
                    If (local10 <> "") Then
                        GUESSEDupdatemoving(local10, 0.8)
                    Else
                        playstepsound((2.5 = local2))
                    EndIf
                EndIf
                If (local0 <> Null) Then
                    local0\Field20 = $07
                    local0\Field28 = 35.0
                EndIf
                XZ0260X8X2\Field5 = ((Abs XZ0260X8X2\Field16) * 40.0)
                If ((((T8X2046020\Field8 And (chs\Field0 = $00)) And (-0.15 > XZ0260X8X2\Field16)) And playerinreachableroom($01, $00, $00)) <> 0) Then
                    local30 = (Abs ((XZ0260X8X2\Field16 * 10.0) * 3.0))
                    playsound_strict(loadtempsound((("SFX\Character\Hurt" + (Str rand($00, $01))) + ".ogg")), $00, $00)
                    XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + local30)
                    XZ0260X8X2\Field1 = max(XZ0260X8X2\Field1, local30)
                    TXDFXDZXXDD\Field15 = (GUESSEDupdateitems_2() + $3E8)
                    If (8.0 <= XZ0260X8X2\Field11) Then
                        kill($00, $01, $00, $01)
                    EndIf
                EndIf
            EndIf
            XZ0260X8X2\Field22 = (fps\Field3[$00] * 2.0)
            XZ0260X8X2\Field16 = 0.0
        Else
            XZ0260X8X2\Field22 = (XZ0260X8X2\Field22 - fps\Field3[$00])
            local31 = clamp(((Abs XZ0260X8X2\Field16) * 6.0), 0.0, 1.0)
            local32 = ((0.002 * local31) + 0.00225)
            XZ0260X8X2\Field16 = max((XZ0260X8X2\Field16 - ((local32 * local21) * fps\Field3[$00])), -0.5)
            If (-0.015 > XZ0260X8X2\Field16) Then
                If (((local0 <> Null) And (0.0 >= local0\Field28)) <> 0) Then
                    local0\Field20 = $06
                EndIf
            EndIf
        EndIf
        playerfallingpickdistance = 10.0
        If (((XZ0260X8X2\Field38 = $02) And shouldentitiesfall) <> 0) Then
            entitylinearvelocity(XZ0260X8X2\Field74, (((cos(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0), ((XZ0260X8X2\Field16 * fps\Field3[$00]) * 105.0), (((sin(XZ0260X8X2\Field75) * XZ0260X8X2\Field76) * fps\Field3[$00]) * 105.0))
        EndIf
    ElseIf (local0 <> Null) Then
        local0\Field20 = $06
        XZ0260X8X2\Field16 = -0.07
    EndIf
    XZ0260X8X2\Field19 = entityy(XZ0260X8X2\Field74, $01, 1.0)
    local33 = (max((((Abs local27) - 0.07) * 2.0), 0.0) * (Float (0.005 < (Abs XZ0260X8X2\Field16))))
    XZ0260X8X2\Field79 = curvevalue(local33, XZ0260X8X2\Field79, 6.0)
    XZ0260X8X2\Field47 = loopsoundlocal(snd_i\Field33, XZ0260X8X2\Field47, (XZ0260X8X2\Field79 * 1.5), $00)
    If (local0 <> Null) Then
        local0\Field28 = (local0\Field28 - fps\Field3[$01])
    EndIf
    If (((XZ0260X8X2\Field6 > XZ0260X8X2\Field56) And (2.5 > local2)) <> 0) Then
        local7 = (0.0 < XZ0260X8X2\Field76)
        XZ0260X8X2\Field56 = min(((((fps\Field3[$00] * 0.2) * (1.0 - ((Float (0.0 >= XZ0260X8X2\Field22)) * 0.3))) * (((((Float local7) * 0.6) + (Float (local7 = $00))) / XZ0260X8X2\Field65) / (i_966\Field1 + 1.0))) + XZ0260X8X2\Field56), 100.0)
    EndIf
    XZ0260X8X2\Field6 = 100.0
    If (i_714\Field0 = $02) Then
        XZ0260X8X2\Field6 = 20.0
        XZ0260X8X2\Field56 = curvevalue(min(XZ0260X8X2\Field6, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 10.0)
        XZ0260X8X2\Field42 = max(-850.0, XZ0260X8X2\Field42)
    ElseIf (i_714\Field0 = $01) Then
        XZ0260X8X2\Field6 = 40.0
        XZ0260X8X2\Field56 = curvevalue(min(XZ0260X8X2\Field6, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 15.0)
    Else
        If (((T8660BZ460\Field6 = $02) Lor (T8660BZ460\Field10 = $01)) <> 0) Then
            XZ0260X8X2\Field6 = 60.0
            XZ0260X8X2\Field56 = curvevalue(min(XZ0260X8X2\Field6, XZ0260X8X2\Field56), XZ0260X8X2\Field56, 20.0)
        EndIf
        If ((((T8660BZ460\Field3 = $03) Lor (T8660BZ460\Field10 = $03)) Lor (i_1499\Field8 = $02)) <> 0) Then
            XZ0260X8X2\Field56 = min(100.0, ((((100.0 - XZ0260X8X2\Field56) * 0.002) * fps\Field3[$00]) + XZ0260X8X2\Field56))
        EndIf
        If (((T8660BZ460\Field3 = $04) Lor (T8660BZ460\Field10 = $04)) <> 0) Then
            XZ0260X8X2\Field56 = min(100.0, ((((100.0 - XZ0260X8X2\Field56) * 0.01) * fps\Field3[$00]) + XZ0260X8X2\Field56))
        EndIf
    EndIf
    update008()
    update009()
    update409()
    update1048aears()
    local34 = $00
    If (local15 = $00) Then
        If (1.0 < XZ0260X8X2\Field11) Then
            local25 = XZ0260X8X2\Field39
            XZ0260X8X2\Field64 = max(max(((sin(((Float millisec) / 100.0)) * XZ0260X8X2\Field39) * 30.0), ((XZ0260X8X2\Field39 * 2.0) * (2.0 - XZ0260X8X2\Field46))), XZ0260X8X2\Field64)
            If (((i_427\Field2 = $00) And (25200.0 > i_427\Field1)) <> 0) Then
                XZ0260X8X2\Field39 = min((((min(XZ0260X8X2\Field11, 4.0) / 300.0) * fps\Field3[$00]) + XZ0260X8X2\Field39), 100.0)
            EndIf
            If (((60.0 >= local25) And (60.0 < XZ0260X8X2\Field39)) <> 0) Then
                createmsg(getlocalstring("msg", "bloodloss"), 6.0)
            EndIf
            If (((1.0 <= XZ0260X8X2\Field39) And (0.0 <= XZ0260X8X2\Field82)) <> 0) Then
                If (((T8660BZ460\Field10 = $00) And (min(XZ0260X8X2\Field11, 4.0) > rnd(200.0, 0.0))) <> 0) Then
                    If (GUESSEDupdatexdb() = $00) Then
                        local4 = createpivot($00)
                        positionentity(local4, (entityx(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.05, 0.05)), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.05, 0.05)), $00)
                        turnentity(local4, 90.0, 0.0, 0.0, $00)
                        entitypick(local4, 0.3)
                        local1 = createdecal(rand($11, $12), pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, (rnd(0.03, 0.08) * min(XZ0260X8X2\Field11, 2.5)), 1.0, $00, $01, $00, $00, $00)
                        local1\Field14 = rnd(0.001, 0.0015)
                        local1\Field3 = (local1\Field9 + rnd(0.008, 0.009))
                        local1\Field5 = -0.0002
                        entityparent(local1\Field0, playerroom\Field15, $01)
                        GUESSEDupdateentity_6(local1, playerroom\Field1)
                        freeentity(local4)
                        local4 = $00
                    EndIf
                    local34 = playsound_strict(snd_i\Field44[rand($00, $03)], $00, $01)
                    ChannelVolume(local34, ((rnd(0.3, 0.6) * opt\Field13) * opt\Field2))
                    ChannelPitch(local34, rand($4E20, $7530))
                    ResumeChannel(local34)
                EndIf
                XZ0260X8X2\Field51 = max(XZ0260X8X2\Field51, (((sin(((Float millisec) / 20.0)) + 1.0) * XZ0260X8X2\Field39) * 0.2))
                If (60.0 < XZ0260X8X2\Field39) Then
                    cansave = $00
                    If (((XZ0260X8X2\Field25 = $00) And (chs\Field7 = $00)) <> 0) Then
                        setcrouch($01)
                    EndIf
                EndIf
                If (100.0 <= XZ0260X8X2\Field39) Then
                    XZ0260X8X2\Field87 = 0.0
                    kill($01, $01, $00, $01)
                ElseIf (80.0 < XZ0260X8X2\Field39) Then
                    local7 = (Int (XZ0260X8X2\Field39 - 80.0))
                    XZ0260X8X2\Field62 = max((150.0 - ((Float local7) * 5.0)), XZ0260X8X2\Field62)
                    XZ0260X8X2\Field87 = max(XZ0260X8X2\Field87, (((Float local7) * (1.0 / 80.0)) + 0.75))
                ElseIf (35.0 < XZ0260X8X2\Field39) Then
                    XZ0260X8X2\Field62 = max((XZ0260X8X2\Field39 + 70.0), XZ0260X8X2\Field62)
                    XZ0260X8X2\Field87 = max(XZ0260X8X2\Field87, ((XZ0260X8X2\Field39 - 35.0) / 60.0))
                EndIf
            EndIf
        ElseIf (60.0 < XZ0260X8X2\Field39) Then
            XZ0260X8X2\Field39 = max(60.0, (XZ0260X8X2\Field39 - (fps\Field3[$00] / ((XZ0260X8X2\Field11 + 1.0) * 490.0))))
        EndIf
    EndIf
    local35 = (fps\Field3[$00] / 70.0)
    If (0.0 < XZ0260X8X2\Field45) Then
        XZ0260X8X2\Field39 = min((XZ0260X8X2\Field39 + (local35 / 4.0)), 100.0)
        XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - (local35 / 40.0)), 0.0)
        XZ0260X8X2\Field45 = max((XZ0260X8X2\Field45 - local35), 0.0)
    EndIf
    i_2022\Field0 = max(0.0, (i_2022\Field0 - (fps\Field3[$00] * 0.0001)))
    If (0.0 < i_2022\Field1) Then
        XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - (local35 / 10.0)), 0.0)
        i_2022\Field1 = max((i_2022\Field1 - local35), 0.0)
    EndIf
    If (0.0 < XZ0260X8X2\Field87) Then
        If (0.0 >= XZ0260X8X2\Field83) Then
            local34 = playsound_strict(snd_i\Field55, $00, $01)
            ChannelVolume(local34, ((XZ0260X8X2\Field87 * opt\Field13) * opt\Field2))
            ResumeChannel(local34)
            XZ0260X8X2\Field83 = ((60.0 / max(XZ0260X8X2\Field62, 1.0)) * 70.0)
        Else
            XZ0260X8X2\Field83 = (XZ0260X8X2\Field83 - fps\Field3[$00])
        EndIf
        XZ0260X8X2\Field87 = max((XZ0260X8X2\Field87 - (fps\Field3[$00] * 0.05)), 0.0)
    EndIf
    catcherrors("Uncaught: UpdateMoving()")
    Return $00
End Function
