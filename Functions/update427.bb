Function update427%()
    Local local0.decals
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5#
    local5 = i_427\Field1
    If (25200.0 > i_427\Field1) Then
        If (i_427\Field2 <> 0) Then
            If (0.0 = XZ0260X8X2\Field48) Then
                i_427\Field1 = (i_427\Field1 + fps\Field3[$00])
                If (0.0 < XZ0260X8X2\Field11) Then
                    XZ0260X8X2\Field11 = max((XZ0260X8X2\Field11 - (fps\Field3[$00] * 0.0006)), 0.0)
                EndIf
                If (((0.0 < XZ0260X8X2\Field39) And (1.0 >= XZ0260X8X2\Field11)) <> 0) Then
                    XZ0260X8X2\Field39 = max((XZ0260X8X2\Field39 - (fps\Field3[$00] * 0.001)), 0.0)
                EndIf
                If (0.0 < i_008\Field0) Then
                    i_008\Field0 = max((i_008\Field0 - (fps\Field3[$00] * 0.004)), 0.0)
                EndIf
                If (0.0 < i_009\Field0) Then
                    i_009\Field0 = max((i_009\Field0 - (fps\Field3[$00] * 0.002)), 0.0)
                EndIf
                If (0.0 < i_409\Field0) Then
                    i_409\Field0 = max((i_409\Field0 - (fps\Field3[$00] * 0.003)), 0.0)
                EndIf
                If (0.0 < i_1048a\Field2) Then
                    i_1048a\Field2 = max((i_1048a\Field2 - (fps\Field3[$00] / 2.0)), 0.0)
                EndIf
                For local2 = $00 To $06 Step $01
                    If (0.0 < i_1025\Field0[local2]) Then
                        i_1025\Field0[local2] = max((i_1025\Field0[local2] - (fps\Field3[$00] * 0.001)), 0.0)
                    EndIf
                Next
                If (0.0 < i_1025\Field1[$00]) Then
                    If (0.05 > i_1025\Field1[$00]) Then
                        For local2 = (maxitemamount - $02) To (maxitemamount - $01) Step $01
                            If (TX60DB8XBBZ(local2) <> Null) Then
                                dropitem(TX60DB8XBBZ(local2), $01)
                            EndIf
                        Next
                        maxitemamount = (maxitemamount - $02)
                        i_1025\Field1[$00] = 0.0
                    Else
                        i_1025\Field1[$00] = max((i_1025\Field1[$00] - (fps\Field3[$00] * 0.0003)), 0.0)
                    EndIf
                EndIf
                i_1025\Field1[$01] = max((i_1025\Field1[$01] - (fps\Field3[$00] * 0.0008)), 0.0)
                For local2 = $02 To $04 Step $01
                    If (0.0 < i_1025\Field1[local2]) Then
                        i_1025\Field1[local2] = max((i_1025\Field1[local2] - (fps\Field3[$00] * 0.0006)), 0.0)
                    EndIf
                Next
            EndIf
            If (i_427\Field3[$00] = $00) Then
                i_427\Field3[$00] = loadsound_strict("SFX\SCP\427\Effect.ogg")
            EndIf
            If (ChannelPlaying(i_427\Field0[$00]) = $00) Then
                i_427\Field0[$00] = playsound_strict(i_427\Field3[$00], $00, $00)
            EndIf
            If (12600.0 <= i_427\Field1) Then
                If (i_427\Field3[$01] = $00) Then
                    i_427\Field3[$01] = loadsound_strict("SFX\SCP\427\Transform.ogg")
                EndIf
                If (ChannelPlaying(i_427\Field0[$01]) = $00) Then
                    i_427\Field0[$01] = playsound_strict(i_427\Field3[$01], $00, $00)
                EndIf
            EndIf
            If (((4200.0 > local5) And (4200.0 <= i_427\Field1)) <> 0) Then
                createmsg(getlocalstring("msg", "freshener"), 6.0)
            ElseIf (((12600.0 > local5) And (12600.0 <= i_427\Field1)) <> 0) Then
                createmsg(getlocalstring("msg", "gentlemuscle"), 6.0)
            EndIf
        Else
            For local2 = $00 To $01 Step $01
                If (ChannelPlaying(i_427\Field0[local2]) <> 0) Then
                    StopChannel(i_427\Field0[local2])
                    i_427\Field0[local2] = $00
                EndIf
            Next
        EndIf
    Else
        cansave = $00
        If (((25200.0 > (local5 - fps\Field3[$00])) And (25200.0 <= i_427\Field1)) <> 0) Then
            createmsg(getlocalstring("msg", "muscleswelling"), 6.0)
        ElseIf (((27300.0 > (local5 - fps\Field3[$00])) And (27300.0 <= i_427\Field1)) <> 0) Then
            createmsg(getlocalstring("msg", "nolegs"), 6.0)
        EndIf
        i_427\Field1 = (i_427\Field1 + fps\Field3[$00])
        If (i_427\Field3[$00] = $00) Then
            i_427\Field3[$00] = loadsound_strict("SFX\SCP\427\Effect.ogg")
        EndIf
        If (i_427\Field3[$01] = $00) Then
            i_427\Field3[$01] = loadsound_strict("SFX\SCP\427\Transform.ogg")
        EndIf
        For local2 = $00 To $01 Step $01
            If (ChannelPlaying(i_427\Field0[local2]) = $00) Then
                i_427\Field0[local2] = playsound_strict(i_427\Field3[local2], $00, $00)
            EndIf
        Next
        If (((T8660BZ460\Field10 = $00) And (2.0 > rnd(200.0, 0.0))) <> 0) Then
            local3 = createpivot($00)
            positionentity(local3, (entityx(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.05, 0.05)), (entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.05), (entityz(XZ0260X8X2\Field74, $00, 1.0) + rnd(-0.05, 0.05)), $00)
            turnentity(local3, 90.0, 0.0, 0.0, $00)
            entitypick(local3, 0.3)
            local0 = createdecal($13, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, (rnd(0.03, 0.08) * 2.0), 1.0, $00, $01, $00, $00, $00)
            local0\Field14 = rnd(0.001, 0.0015)
            local0\Field3 = (local0\Field9 + 0.009)
            local0\Field5 = -0.0002
            entityparent(local0\Field0, playerroom\Field15, $01)
            local4 = playsound_strict(snd_i\Field44[rand($00, $03)], $00, $00)
            ChannelVolume(local4, ((rnd(0.3, 0.6) * opt\Field13) * opt\Field2))
            ChannelPitch(local4, rand($4E20, $7530))
            freeentity(local3)
            local3 = $00
            XZ0260X8X2\Field64 = 800.0
        EndIf
        If (29400.0 <= i_427\Field1) Then
            msg\Field8 = getlocalstring("death", "morepower")
            kill($00, $01, $00, $01)
        ElseIf (27300.0 <= i_427\Field1) Then
            If (XZ0260X8X2\Field25 = $00) Then
                setcrouch($01)
            EndIf
        EndIf
    EndIf
    Return $00
End Function
