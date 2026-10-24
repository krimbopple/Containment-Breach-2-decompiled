Function TX04062ZD44%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0.events
    Local local1.items
    Local local2.TX2BF6X0FF4
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12.decals
    Local local13.itemtemplates
    Local local14%
    If (TXB2BFFFFFX() = $00) Then
        Return $00
    EndIf
    Select arg2
        Case $00
            If ((((arg1 < $1E) And (XXDB6F64F2[arg0\Field3]\Field27[arg1] <> $00)) And (2.0 > entitydistancesquared(arg0\Field52, XXDB6F64F2[arg0\Field3]\Field27[arg1]))) <> 0) Then
                Select XXDB6F64F2[arg0\Field3]\Field22\Field21
                    Case $59
                        If (((arg1 = $01) And (arg0\Field46\Field11 = $00)) <> 0) Then
                            If (arg0\Field13 <> TXXDZB2ZBXX()) Then
                                local1 = createitem("Pizza Slice", $6C, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                                entitytype(local1\Field9, $03, $00)
                                FD640Z8B(arg0, local1)
                            EndIf
                            arg0\Field46\Field11 = $01
                        EndIf
                    Case $2C
                        If (((arg1 = $00) And soundtransmission) <> 0) Then
                            For local0 = Each events
                                If (local0\Field32 = $17) Then
                                    If (0.0 = local0\Field4) Then
                                        If (ChannelPlaying(local0\Field2) <> 0) Then
                                            StopChannel(local0\Field2)
                                            local0\Field2 = $00
                                        EndIf
                                        snd_i\Field60 = loadsound_strict("SFX\Room\106Chamber\FemurBreaker.ogg")
                                        local0\Field2 = playsound_strict(snd_i\Field60, $01, $00)
                                        local0\Field4 = 1.0
                                        For local2 = Each TX2BF6X0FF4
                                            If (local2\Field13 > $01) Then
                                                blitz_TXXF80Z0FD00($12)
                                                blitz_TXXF80Z0FD00(local0\Field25)
                                                XFD24F6402(local2\Field7, local2\Field25, $00, $01, $00)
                                            EndIf
                                        Next
                                    EndIf
                                    Exit
                                EndIf
                            Next
                        EndIf
                    Case $00
                        Select arg1
                            Case $01
                                TZ8Z82X06D("SFX\SCP\Joke\Quack.ogg", XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0, $00, $00)
                                X42666Z0B0(Null, "SFX\SCP\Joke\Quack.ogg", XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0)
                            Case $02
                                TZ8Z82X06D((("SFX\Interact\PennyFlip" + (Str rand($00, $01))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 8.0, 1.0, $00, $00)
                                X42666Z0B0(Null, (("SFX\Interact\PennyFlip" + (Str rand($00, $01))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 8.0, 1.0)
                                For local0 = Each events
                                    If (local0\Field32 = $01) Then
                                        If (0.0 = local0\Field7) Then
                                            local0\Field7 = (Float rand($01, $02))
                                        EndIf
                                        For local2 = Each TX2BF6X0FF4
                                            If (local2\Field13 > $01) Then
                                                blitz_TXXF80Z0FD00($12)
                                                blitz_TXXF80Z0FD00(local0\Field25)
                                                XFD24F6402(local2\Field7, local2\Field25, $00, $01, $00)
                                            EndIf
                                        Next
                                        Exit
                                    EndIf
                                Next
                        End Select
                    Case $5B
                        local6 = arg1
                        If (local6 = $01) Then
                            TZ8Z82X06D("SFX\SCP\Joke\Quack.ogg", XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0, $00, $00)
                            X42666Z0B0(Null, "SFX\SCP\Joke\Quack.ogg", XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0)
                        EndIf
                    Case $3C
                        local7 = arg1
                        If (local7 = $05) Then
                            For local0 = Each events
                                If (local0\Field32 = $24) Then
                                    If (0.0 = local0\Field23) Then
                                        If (opt\Field69 > $00) Then
                                            local0\Field19\Field17[$00] = setemitter(local0\Field19, entityx(local0\Field19\Field27[$06], $01, 1.0), entityy(local0\Field19\Field27[$06], $01, 1.0), entityz(local0\Field19\Field27[$06], $01, 1.0), $12)
                                            local0\Field19\Field17[$00]\Field7 = $03
                                        EndIf
                                        local0\Field23 = 0.01
                                    EndIf
                                    For local2 = Each TX2BF6X0FF4
                                        If (local2\Field13 > $01) Then
                                            blitz_TXXF80Z0FD00($12)
                                            blitz_TXXF80Z0FD00(local0\Field25)
                                            XFD24F6402(local2\Field7, local2\Field25, $00, $01, $00)
                                        EndIf
                                    Next
                                    Exit
                                EndIf
                            Next
                        EndIf
                End Select
            EndIf
        Case $01
            If (((((arg1 < $10) And (XXDB6F64F2[arg0\Field3]\Field32[arg1] <> Null)) And (2.0 > entitydistancesquared(arg0\Field52, XXDB6F64F2[arg0\Field3]\Field32[arg1]\Field82))) And (arg0\Field13 <> TXXDZB2ZBXX())) <> 0) Then
                local8 = XXDB6F64F2[arg0\Field3]\Field22\Field21
                If (local8 = $42) Then
                    local1 = createitem("Drawing", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
                    entitytype(local1\Field9, $03, $00)
                    FD640Z8B(arg0, local1)
                    removeevent(X4X08826F2[XXDB6F64F2[arg0\Field3]\Field32[arg1]\Field75])
                    removenpc(XXDB6F64F2[arg0\Field3]\Field32[arg1])
                EndIf
            EndIf
        Case $02
            If ((((arg1 = $00) And (XXDB6F64F2[arg0\Field3]\Field27[arg1] <> $00)) And (2.0 > entitydistancesquared(arg0\Field52, XXDB6F64F2[arg0\Field3]\Field27[arg1]))) <> 0) Then
                local9 = XXDB6F64F2[arg0\Field3]\Field22\Field21
                If (local9 = $1F) Then
                    local10 = createpivot(XXDB6F64F2[arg0\Field3]\Field15)
                    positionentity(local10, 976.0, 128.0, -640.0, $00)
                    If (arg0\Field46\Field22 = Null) Then
                        TZ8Z82X06D((("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0, $00, $00)
                        X42666Z0B0(arg0, (("SFX\SCP\1162_ARC\BodyHorrorExchange" + (Str rand($00, $03))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0)
                        local11 = createpivot($00)
                        positionentity(local11, entityx(arg0\Field52, $00, 1.0), (entityy(arg0\Field52, $00, 1.0) - 0.05), entityz(arg0\Field52, $00, 1.0), $00)
                        turnentity(local11, 90.0, 0.0, 0.0, $00)
                        entitypick(local11, 0.3)
                        local12 = createdecal($03, pickedx(), (pickedy() + 0.005), pickedz(), 90.0, rnd(360.0, 0.0), 0.0, 0.75, 1.0, $00, $01, $00, $00, $00)
                        entityparent(local12\Field0, XXDB6F64F2[arg0\Field3]\Field15, $01)
                        freeentity(local11)
                        XZ48406XD0(local12, arg0\Field3)
                        arg0\Field46\Field9 = (arg0\Field46\Field9 + 5.0)
                        If (15.0 < arg0\Field46\Field9) Then
                            Y0FFZFZ0Z(arg0, $00, $00)
                        EndIf
                        For local13 = Each itemtemplates
                            If ((isitemgoodfor1162arc(local13) And (rand($06, $01) = $01)) <> 0) Then
                                local1 = createitem(local13\Field19, local13\Field9, entityx(local10, $01, 1.0), entityy(local10, $01, 1.0), entityz(local10, $01, 1.0), $00, $00, $00, 1.0, $00)
                                entitytype(local1\Field9, $03, $00)
                                Exit
                            EndIf
                        Next
                    Else
                        TZ8Z82X06D((("SFX\SCP\1162_ARC\Exchange" + (Str rand($00, $04))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0, $00, $00)
                        X42666Z0B0(arg0, (("SFX\SCP\1162_ARC\Exchange" + (Str rand($00, $04))) + ".ogg"), XXDB6F64F2[arg0\Field3]\Field27[arg1], 10.0, 1.0)
                        local14 = $00
                        For local13 = Each itemtemplates
                            If (isitemgoodfor1162arc(local13) <> 0) Then
                                Select arg0\Field46\Field22\Field6\Field9
                                    Case $69
                                        If ((((local13\Field9 = $59) Lor (local13\Field9 = $5A)) And (rand($02, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $00,$01
                                        If (((local13\Field9 = $00) And (rand($0C, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $38,$39,$3A,$3B,$3C,$3D,$3E,$3F
                                        If ((((((((((local13\Field9 = $38) Lor (local13\Field9 = $39)) Lor (local13\Field9 = $3A)) Lor (local13\Field9 = $3B)) Lor (local13\Field9 = $3C)) Lor (local13\Field9 = $3D)) Lor (local13\Field9 = $3E)) Lor (local13\Field9 = $3F)) And (rand($02, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $59,$5A,$5B,$5C
                                        If ((((((local13\Field9 = $59) Lor (local13\Field9 = $5A)) Lor (local13\Field9 = $5B)) Lor (local13\Field9 = $5C)) And (rand($0C, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $61,$63,$02,$2F
                                        If ((((((local13\Field9 = $61) Lor (local13\Field9 = $63)) Lor (local13\Field9 = $02)) Lor (local13\Field9 = $2F)) And (rand($05, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $27,$28
                                        If ((((local13\Field9 = $27) Lor (local13\Field9 = $28)) And (rand($02, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Case $30,$32,$33,$55,$56,$57,$0E,$10,$0F
                                        If (((((((((((local13\Field9 = $30) Lor (local13\Field9 = $32)) Lor (local13\Field9 = $33)) Lor (local13\Field9 = $55)) Lor (local13\Field9 = $56)) Lor (local13\Field9 = $57)) Lor (local13\Field9 = $0F)) Lor (local13\Field9 = $10)) Lor (local13\Field9 = $0E)) And (rand($04, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                    Default
                                        If ((((local13\Field9 = $61) Lor (local13\Field9 = $63)) And (rand($06, $01) = $01)) <> 0) Then
                                            local14 = $01
                                        EndIf
                                End Select
                            EndIf
                            If (local14 <> 0) Then
                                local1 = createitem(local13\Field19, local13\Field9, entityx(local10, $01, 1.0), entityy(local10, $01, 1.0), entityz(local10, $01, 1.0), $00, $00, $00, 1.0, $00)
                                entitytype(local1\Field9, $03, $00)
                                Exit
                            EndIf
                        Next
                    EndIf
                    freeentity(local10)
                EndIf
            EndIf
    End Select
    Return $00
End Function
