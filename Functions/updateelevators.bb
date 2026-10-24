Function updateelevators#(arg0#, arg1.doors, arg2.doors, arg3%, arg4%, arg5.events, arg6%, arg7%)
    Local local0.npcs
    Local local1.items
    Local local2.decals
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local22#
    Local local23#
    Local local24#
    Local local25#
    Local local26%
    Local local27%
    Local local28#
    Local local29.emitter
    arg1\Field19 = $01
    arg2\Field19 = $01
    If ((((arg1\Field39 And (arg2\Field39 = $00)) And (180.0 = arg1\Field13)) And (518.0 > arg0)) <> 0) Then
        arg0 = -1.0
        arg1\Field21 = $00
        If ((((d_i\Field15 = arg2\Field40[$00]) Lor (d_i\Field15 = arg2\Field40[$01])) And XZ0260X8X2\Field3) <> 0) Then
            openclosedoor(arg1, $01, $00)
            updateelevatorpanel(arg2)
        EndIf
    ElseIf (((arg2\Field39 And (arg1\Field39 = $00)) And (180.0 = arg2\Field13)) <> 0) Then
        arg0 = 1.0
        arg2\Field21 = $00
        If ((((d_i\Field15 = arg1\Field40[$00]) Lor (d_i\Field15 = arg1\Field40[$01])) And XZ0260X8X2\Field3) <> 0) Then
            openclosedoor(arg2, $01, $00)
            updateelevatorpanel(arg1)
        EndIf
    ElseIf (0.2 > (Abs (arg1\Field13 - arg2\Field13))) Then
        arg1\Field19 = $02
        arg2\Field19 = $02
    EndIf
    arg1\Field21 = $01
    arg2\Field21 = $01
    If (arg1\Field39 <> 0) Then
        arg1\Field19 = $03
        If (XZ0260X8X2\Field27 <> 0) Then
            If (518.0 > arg0) Then
                arg1\Field21 = $00
            EndIf
            arg1\Field19 = $01
        EndIf
    EndIf
    If (arg2\Field39 <> 0) Then
        arg2\Field19 = $03
        If (XZ0260X8X2\Field27 <> 0) Then
            arg2\Field21 = $00
            arg2\Field19 = $01
        EndIf
    EndIf
    local8 = $00
    If (n_i\Field10 <> Null) Then
        If ((((((1.0 < n_i\Field10\Field66) And (n_i\Field10\Field59 = Null)) And (infacility = $00)) And XZ0260X8X2\Field27) And (chs\Field8 = $00)) <> 0) Then
            local8 = $01
        EndIf
    EndIf
    If ((((local8 = $00) And (arg1\Field38 = $00)) And (arg2\Field38 = $00)) <> 0) Then
        If (((arg1\Field39 = $00) And (arg2\Field39 = $00)) <> 0) Then
            If (XZ0260X8X2\Field27 <> 0) Then
                cansave = $00
            EndIf
            arg1\Field21 = $01
            arg2\Field21 = $01
            If (((0.0 = arg1\Field13) And (0.0 = arg2\Field13)) <> 0) Then
                local9 = entityx(XZ0260X8X2\Field74, $01, 1.0)
                local10 = entityy(XZ0260X8X2\Field74, $01, 1.0)
                local11 = entityz(XZ0260X8X2\Field74, $01, 1.0)
                local12 = entityx(arg3, $01, 1.0)
                local13 = entityy(arg3, $01, 1.0)
                local14 = entityz(arg3, $01, 1.0)
                local15 = entityyaw(arg3, $01, 1.0)
                local16 = entityx(arg4, $01, 1.0)
                local17 = entityy(arg4, $01, 1.0)
                local18 = entityz(arg4, $01, 1.0)
                local19 = entityyaw(arg4, $01, 1.0)
                local20 = 0.87375
                local21 = -0.87375
                local22 = (fps\Field3[$00] * 0.1)
                local26 = $00
                If (0.0 > arg0) Then
                    arg0 = (arg0 - fps\Field3[$00])
                    local26 = isinsideelevator(local9, local10, local11, arg3)
                    If (local26 <> 0) Then
                        If (arg7 <> 0) Then
                            If (((-250.0 < arg0) Lor (-500.0 >= arg0)) <> 0) Then
                                If (ChannelPlaying(arg1\Field16) = $00) Then
                                    arg1\Field16 = playsound_strict(snd_i\Field25, $00, $00)
                                    updateelevatorpanel(arg1)
                                EndIf
                                local27 = (Int ((Float (-500.0 >= arg0)) + 1.0))
                                XZ0260X8X2\Field1 = (sin(((Abs arg0) / (3.0 * (Float local27)))) * (0.3 * (Float local27)))
                                If (((-235.0 <= arg0) And (-235.0 > (arg0 - fps\Field3[$00]))) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Room\Blackout.ogg"), $00, $00)
                                EndIf
                            ElseIf (-500.0 < arg0) Then
                                If (ChannelPlaying(arg1\Field16) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Room\Intro\Bang2.ogg"), $00, $00)
                                    XZ0260X8X2\Field8 = 6.5
                                    StopChannel(arg1\Field16)
                                    arg1\Field16 = $00
                                    clearelevatorpaneltexture(arg1)
                                    clearelevatorpaneltexture(arg2)
                                    XZ0260X8X2\Field14 = 5.3
                                EndIf
                                If (((-490.0 <= arg0) And (-490.0 > (arg0 - fps\Field3[$00]))) <> 0) Then
                                    playsound_strict(snd_i\Field34, $00, $00)
                                EndIf
                            EndIf
                        Else
                            If (ChannelPlaying(arg1\Field16) = $00) Then
                                arg1\Field16 = playsound_strict(snd_i\Field25, $00, $00)
                                updateelevatorpanel(arg1)
                            EndIf
                            XZ0260X8X2\Field1 = (sin(((Abs arg0) / 3.0)) * 0.3)
                        EndIf
                    EndIf
                    If ((((arg7 = $00) And (-500.0 > arg0)) Lor (-1000.0 > arg0)) <> 0) Then
                        arg1\Field21 = $01
                        arg2\Field21 = $00
                        arg0 = 0.0
                        If (local26 <> 0) Then
                            If (arg6 = $00) Then
                                local5 = distance(local9, local12, local11, local14, 0.0, 0.0)
                                local6 = pointdirection(local9, local11, local12, local14)
                                local6 = ((local6 + local19) - local15)
                                local6 = wrapangle(local6, 360.0)
                                local3 = clamp((cos(local6) * local5), local21, local20)
                                local4 = clamp((sin(local6) * local5), local21, local20)
                                rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $01, 1.0), (angledist(entityyaw(XZ0260X8X2\Field74, $01, 1.0), local15) + local19), entityroll(XZ0260X8X2\Field74, $01, 1.0), $01)
                            Else
                                local3 = clamp((local9 - local12), local21, local20)
                                local4 = clamp((local11 - local14), local21, local20)
                            EndIf
                            teleportentity(XZ0260X8X2\Field74, (local16 + local3), ((local22 + local17) + (local10 - local13)), (local18 + local4), 0.3, $01, 2.0, $00)
                            XZ0260X8X2\Field16 = 0.0
                            BXZDBZ0BB\Field1 = 0.0
                            BXZDBZ0BB\Field4 = 0.0
                            updatelightvolume()
                            updatedoors()
                            updaterooms()
                            updatemouselook()
                            arg1\Field45 = playsoundex(TZ2064ZFDB($01, rand($00, $02)), camera, arg1\Field0, 10.0, 1.0, $00, $00)
                        EndIf
                        For local0 = Each npcs
                            local23 = entityx(local0\Field82, $01, 1.0)
                            local24 = entityy(local0\Field82, $01, 1.0)
                            local25 = entityz(local0\Field82, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg3) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local12, local25, local14, 0.0, 0.0)
                                    local6 = pointdirection(local23, local25, local12, local14)
                                    local6 = ((local6 + local19) - local15)
                                    local6 = wrapangle(local6, 360.0)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local0\Field82, entitypitch(local0\Field82, $01, 1.0), (angledist(entityyaw(local0\Field82, $01, 1.0), local15) + local19), entityroll(local0\Field82, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local12), local21, local20)
                                    local4 = clamp((local25 - local14), local21, local20)
                                EndIf
                                teleportentity(local0\Field82, (local16 + local3), ((local22 + local17) + (local24 - local13)), (local18 + local4), local0\Field23, $01, 2.0, $00)
                            EndIf
                        Next
                        For local1 = Each items
                            local23 = entityx(local1\Field9, $01, 1.0)
                            local24 = entityy(local1\Field9, $01, 1.0)
                            local25 = entityz(local1\Field9, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg3) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local12, local25, local14, 0.0, 0.0)
                                    local6 = pointdirection(local23, local25, local12, local14)
                                    local6 = ((local6 + local19) - local15)
                                    local6 = wrapangle(local6, 360.0)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local1\Field9, entitypitch(local1\Field9, $01, 1.0), (angledist(entityyaw(local1\Field9, $01, 1.0), local15) + local19), entityroll(local1\Field9, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local12), local21, local20)
                                    local4 = clamp((local25 - local14), local21, local20)
                                EndIf
                                teleportentity(local1\Field9, (local16 + local3), ((local22 + local17) + (local24 - local13)), (local18 + local4), 0.01, $01, 2.0, $00)
                                local1\Field25 = 0.0
                                updateitems()
                            EndIf
                        Next
                        For local2 = Each decals
                            local23 = entityx(local2\Field0, $01, 1.0)
                            local24 = entityy(local2\Field0, $01, 1.0)
                            local25 = entityz(local2\Field0, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg3) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local12, entityz(local2\Field0, $01, 1.0), local14, 0.0, 0.0)
                                    local6 = pointdirection(local23, entityz(local2\Field0, $01, 1.0), local12, local14)
                                    local6 = ((local6 + local19) - local15)
                                    local6 = wrapangle(local6, 360.0)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local2\Field0, entitypitch(local2\Field0, $01, 1.0), (angledist(entityyaw(local2\Field0, $01, 1.0), local15) + local19), entityroll(local2\Field0, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local12), local21, local20)
                                    local4 = clamp((local25 - local14), local21, local20)
                                EndIf
                                teleportentity(local2\Field0, (local16 + local3), ((local22 + local17) + (local24 - local13)), (local18 + local4), -0.01, $01, 2.0, $00)
                                updatedecals()
                            EndIf
                        Next
                        openclosedoor(arg2, (XZ0260X8X2\Field27 = $00), $00)
                        arg1\Field39 = $00
                        clearelevatorpaneltexture(arg1)
                        clearelevatorpaneltexture(arg2)
                        playsoundex(snd_i\Field22, camera, arg3, 4.0, 1.0, $00, $00)
                    EndIf
                Else
                    arg0 = (fps\Field3[$00] + arg0)
                    local26 = isinsideelevator(local9, local10, local11, arg4)
                    If (local26 <> 0) Then
                        If (arg7 <> 0) Then
                            If (((250.0 > arg0) Lor (500.0 <= arg0)) <> 0) Then
                                If (ChannelPlaying(arg2\Field16) = $00) Then
                                    arg2\Field16 = playsound_strict(snd_i\Field25, $00, $00)
                                    updateelevatorpanel(arg2)
                                EndIf
                                local27 = (Int ((Float (500.0 <= arg0)) + 1.0))
                                XZ0260X8X2\Field1 = (sin(((Abs arg0) / (3.0 * (Float local27)))) * (0.3 * (Float local27)))
                                If (((235.0 >= arg0) And (235.0 < (fps\Field3[$00] + arg0))) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Room\Blackout.ogg"), $00, $00)
                                EndIf
                            ElseIf (500.0 > arg0) Then
                                If (ChannelPlaying(arg2\Field16) <> 0) Then
                                    playsound_strict(loadtempsound("SFX\Room\Intro\Bang2.ogg"), $00, $00)
                                    XZ0260X8X2\Field8 = 6.5
                                    StopChannel(arg2\Field16)
                                    arg2\Field16 = $00
                                    clearelevatorpaneltexture(arg1)
                                    clearelevatorpaneltexture(arg2)
                                    XZ0260X8X2\Field14 = 5.3
                                EndIf
                                If (((490.0 >= arg0) And (490.0 < (fps\Field3[$00] + arg0))) <> 0) Then
                                    playsound_strict(snd_i\Field34, $00, $00)
                                EndIf
                            EndIf
                        Else
                            If (ChannelPlaying(arg2\Field16) = $00) Then
                                arg2\Field16 = playsound_strict(snd_i\Field25, $00, $00)
                                updateelevatorpanel(arg2)
                            EndIf
                            XZ0260X8X2\Field1 = (sin(((Abs arg0) / 3.0)) * 0.3)
                        EndIf
                    EndIf
                    If ((((arg7 = $00) And (500.0 < arg0)) Lor (1000.0 < arg0)) <> 0) Then
                        arg1\Field21 = $00
                        arg2\Field21 = $01
                        arg0 = 0.0
                        If (local26 <> 0) Then
                            If (arg6 = $00) Then
                                local5 = distance(local9, local16, local11, local18, 0.0, 0.0)
                                local6 = pointdirection(local9, local11, local16, local18)
                                local6 = ((local6 + local15) - local19)
                                local3 = clamp((cos(local6) * local5), local21, local20)
                                local4 = clamp((sin(local6) * local5), local21, local20)
                                rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $01, 1.0), (angledist(entityyaw(XZ0260X8X2\Field74, $01, 1.0), local19) + local15), entityroll(XZ0260X8X2\Field74, $01, 1.0), $01)
                            Else
                                local3 = clamp((local9 - local16), local21, local20)
                                local4 = clamp((local11 - local18), local21, local20)
                            EndIf
                            teleportentity(XZ0260X8X2\Field74, (local12 + local3), ((local22 + local13) + (local10 - local17)), (local14 + local4), 0.3, $01, 2.0, $00)
                            XZ0260X8X2\Field16 = 0.0
                            BXZDBZ0BB\Field4 = 0.0
                            BXZDBZ0BB\Field1 = 0.0
                            updatelightvolume()
                            updatedoors()
                            updaterooms()
                            updatemouselook()
                            arg2\Field45 = playsoundex(TZ2064ZFDB($01, rand($00, $02)), camera, arg2\Field0, 10.0, 1.0, $00, $00)
                        EndIf
                        For local0 = Each npcs
                            local23 = entityx(local0\Field82, $01, 1.0)
                            local24 = entityy(local0\Field82, $01, 1.0)
                            local25 = entityz(local0\Field82, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg4) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local16, local25, local18, 0.0, 0.0)
                                    local6 = pointdirection(local23, local25, local16, local18)
                                    local6 = ((local6 + local15) - local19)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local0\Field82, entitypitch(local0\Field82, $01, 1.0), (angledist(entityyaw(local0\Field82, $01, 1.0), local19) + local15), entityroll(local0\Field82, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local16), local21, local20)
                                    local4 = clamp((local25 - local18), local21, local20)
                                EndIf
                                teleportentity(local0\Field82, (local12 + local3), ((local22 + local13) + (local24 - local17)), (local14 + local4), local0\Field23, $01, 2.0, $00)
                            EndIf
                        Next
                        For local1 = Each items
                            local23 = entityx(local1\Field9, $01, 1.0)
                            local24 = entityy(local1\Field9, $01, 1.0)
                            local25 = entityz(local1\Field9, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg4) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local16, local25, local18, 0.0, 0.0)
                                    local6 = pointdirection(local23, local25, local16, local18)
                                    local6 = ((local6 + local15) - local19)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local1\Field9, entitypitch(local1\Field9, $01, 1.0), (angledist(entityyaw(local1\Field9, $01, 1.0), local19) + local15), entityroll(local1\Field9, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local16), local21, local20)
                                    local4 = clamp((local25 - local18), local21, local20)
                                EndIf
                                teleportentity(local1\Field9, (local12 + local3), ((local22 + local13) + (local24 - local17)), (local14 + local4), 0.01, $01, 2.0, $00)
                                local1\Field25 = 0.0
                                updateitems()
                            EndIf
                        Next
                        For local2 = Each decals
                            local23 = entityx(local2\Field0, $01, 1.0)
                            local24 = entityy(local2\Field0, $01, 1.0)
                            local25 = entityz(local2\Field0, $01, 1.0)
                            If (isinsideelevator(local23, local24, local25, arg4) <> 0) Then
                                If (arg6 = $00) Then
                                    local5 = distance(local23, local16, local25, local18, 0.0, 0.0)
                                    local6 = pointdirection(local23, local25, local16, local18)
                                    local6 = ((local6 + local15) - local19)
                                    local3 = clamp((cos(local6) * local5), local21, local20)
                                    local4 = clamp((sin(local6) * local5), local21, local20)
                                    rotateentity(local2\Field0, entitypitch(local2\Field0, $01, 1.0), (angledist(entityyaw(local2\Field0, $01, 1.0), local19) + local15), entityroll(local2\Field0, $01, 1.0), $01)
                                Else
                                    local3 = clamp((local23 - local16), local21, local20)
                                    local4 = clamp((local25 - local18), local21, local20)
                                EndIf
                                teleportentity(local2\Field0, (local12 + local3), ((local22 + local13) + (local24 - local17)), (local14 + local4), -0.01, $01, 2.0, $00)
                                updatedecals()
                            EndIf
                        Next
                        openclosedoor(arg1, (XZ0260X8X2\Field27 = $00), $00)
                        arg2\Field39 = $00
                        clearelevatorpaneltexture(arg1)
                        clearelevatorpaneltexture(arg2)
                        playsoundex(snd_i\Field22, camera, arg4, 4.0, 1.0, $00, $00)
                    EndIf
                EndIf
            EndIf
            T42Z6D220X(arg1, $01)
            T42Z6D220X(arg2, $01)
        EndIf
    Else
        local28 = arg0
        If (0.0 > arg0) Then
            arg0 = 0.0
            local28 = 0.0
        EndIf
        If (((0.0 = arg1\Field13) And (arg1\Field39 = $00)) <> 0) Then
            If (XZ0260X8X2\Field27 <> 0) Then
                If (0.0 = arg0) Then
                    teleportentity(n_i\Field10\Field82, entityx(arg1\Field51, $00, 1.0), (entityy(arg1\Field51, $00, 1.0) + 1.0), entityz(arg1\Field51, $00, 1.0), n_i\Field10\Field23, $00, 2.0, $00)
                    n_i\Field10\Field90 = playerroom
                    pointentity(n_i\Field10\Field82, arg3, 0.0)
                    rotateentity(n_i\Field10\Field82, 0.0, entityyaw(n_i\Field10\Field82, $00, 1.0), 0.0, $00)
                    moveentity(n_i\Field10\Field82, 0.0, 0.0, -0.5, $00)
                    resetentity(n_i\Field10\Field82)
                    n_i\Field10\Field66 = 6.0
                    setnpcframe(n_i\Field10, 0.0, $01)
                    loadeventsound(arg5, "SFX\SCP\096\ElevatorSlam.ogg", $00)
                    arg0 = ((fps\Field3[$00] * 1.4) + arg0)
                    arg1\Field21 = $01
                    updateelevatorpanel(arg1)
                EndIf
            EndIf
        EndIf
        If (0.0 < arg0) Then
            If (0.0 = local28) Then
                arg5\Field2 = playsound_strict(arg5\Field0, $01, $00)
            EndIf
            If (((133.0 < arg0) And (arg0 < (fps\Field3[$00] + 140.0))) <> 0) Then
                XZ0260X8X2\Field14 = 7.0
            ElseIf (((294.0 < arg0) And (arg0 < (fps\Field3[$00] + 297.5))) <> 0) Then
                XZ0260X8X2\Field14 = 2.0
            ElseIf (((413.0 < arg0) And (arg0 < (fps\Field3[$00] + 416.5))) <> 0) Then
                XZ0260X8X2\Field14 = 2.0
            ElseIf (((507.5 < arg0) And (arg0 < (fps\Field3[$00] + 511.0))) <> 0) Then
                XZ0260X8X2\Field14 = 2.0
                arg1\Field27 = $01
                arg1\Field39 = $01
                local29 = setemitter(Null, entityx(arg1\Field0, $01, 1.0), entityy(arg1\Field0, $01, 1.0), entityz(arg1\Field0, $01, 1.0), $10)
                entityparent(local29\Field2, arg1\Field0, $01)
                n_i\Field10\Field66 = 5.0
                n_i\Field10\Field17 = $01
            ElseIf (((567.0 < arg0) And (arg0 < (fps\Field3[$00] + 570.5))) <> 0) Then
                XZ0260X8X2\Field14 = 2.0
            EndIf
            If (567.0 >= arg0) Then
                arg1\Field13 = min(arg1\Field13, 20.0)
            EndIf
            arg0 = (fps\Field3[$00] + arg0)
        EndIf
    EndIf
    Return arg0
    Return 0.0
End Function
