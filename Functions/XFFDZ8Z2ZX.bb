Function XFFDZ8Z2ZX%(arg0.TX2BF6X0FF4)
    Local local0%
    Local local1%
    Local local2.T24B4ZF6F6
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7.items
    Local local8%
    Local local9.TX2BF6X0FF4
    Local local10.particles
    Local local11%
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16%
    Local local17%
    Local local18%
    If (arg0\Field13 = TXXDZB2ZBXX()) Then
        Return $00
    EndIf
    local0 = TZBZ0DD20B(arg0, $05)
    local1 = $00
    X8Z6FF6ZZ6(arg0\Field44\Field4[$00], 1.75, 0.01)
    X8Z6FF6ZZ6(arg0\Field44\Field4[$01], 1.75, 0.065)
    If (T4X2FD2BB4(arg0, $06) <> $00) Then
        If (((FD020X0BZ\Field11 = arg0) And (FD020X0BZ\Field8 = $01)) <> 0) Then
            local2 = X4DZBDB0DZ(T222X2BB2B(E0B68ZZ2(arg0, $06)))
            If (local2 = Null) Then
                Return $00
            EndIf
            If (((X2D02ZD848() <> Null) And (X2D02ZD848() <> arg0)) <> 0) Then
                TX0Z8FFZ8Z0(Null, Null, $00)
            EndIf
            local3 = ((FB60D4B(arg0, $FFFFFFFF, $10) Lor FB60D4B(arg0, $FFFFFFFF, $0B)) Lor (arg0\Field20 = $02))
            local4 = ((FB60D4B(arg0, $FFFFFFFF, $11) Lor FB60D4B(arg0, $FFFFFFFF, $0C)) Lor (arg0\Field20 = $03))
            TX0Z8FFZ8Z0(local2, Null, $00)
            T2482D2008((arg0\Field55\Field16 + $01))
            YDF04ZBBZ(arg0\Field44\Field9)
            DX6BFD48F(local3)
            D2ZZFBD8F(local4)
            XD62FZZ28Z(arg0\Field37)
            A2B26ZFD0(arg0)
            TXF66Z4DBXZ((local2\Field3\Field26 And ((arg0\Field20 = $0F) Lor (arg0\Field20 = $11))))
        EndIf
        Return $00
    EndIf
    If (local0 <> $00) Then
        If (arg0\Field44\Field1 <> Null) Then
            arg0\Field44\Field3 = (arg0\Field44\Field3 - fps\Field3[$00])
            If (0.0 >= arg0\Field44\Field3) Then
                If (arg0\Field44\Field1\Field29 = arg0\Field13) Then
                    XZD248D24X(arg0\Field44\Field1)
                EndIf
                arg0\Field44\Field1 = Null
            EndIf
            TZ84426XFB(arg0)
            Return $00
        EndIf
        local6 = T4X2FD2BB4(arg0, $05)
        local2 = X4DZBDB0DZ(local0)
        If (local2 = Null) Then
            Return $00
        EndIf
        If (((local6 <> $00) And (countchildren(local6) > $00)) <> 0) Then
            local5 = getchild(local6, $01)
        EndIf
        If (((FD020X0BZ\Field11 = arg0) And (FD020X0BZ\Field8 = $01)) <> 0) Then
            If (((X2D02ZD848() <> Null) And (X2D02ZD848() <> arg0)) <> 0) Then
                TX0Z8FFZ8Z0(Null, Null, $00)
            EndIf
            local3 = ((FB60D4B(arg0, $FFFFFFFF, $10) Lor FB60D4B(arg0, $FFFFFFFF, $0B)) Lor (arg0\Field20 = $02))
            local4 = ((FB60D4B(arg0, $FFFFFFFF, $11) Lor FB60D4B(arg0, $FFFFFFFF, $0C)) Lor (arg0\Field20 = $03))
            TX0Z8FFZ8Z0(local2, Null, $00)
            T2482D2008((arg0\Field55\Field16 + $01))
            YDF04ZBBZ(arg0\Field44\Field9)
            DX6BFD48F(local3)
            D2ZZFBD8F(local4)
            XD62FZZ28Z(arg0\Field37)
            A2B26ZFD0(arg0)
            local1 = $01
        EndIf
        If (((local2\Field3\Field26 = $00) And (arg0\Field29 > arg0\Field44\Field7)) <> 0) Then
            local7 = A6020Z028(arg0, $05)
            If (((0.0 = arg0\Field44\Field6) And ((local7 = Null) Lor (0.0 < local7\Field15))) <> 0) Then
                If (TXB2BFFFFFX() <> 0) Then
                    local8 = (Int min((((Float arg0\Field39) / 1.6) / 16.0), 17.0))
                    For local9 = Each TX2BF6X0FF4
                        X244B4FD0F(local9, local8)
                    Next
                EndIf
                X6FX0880Z6(arg0)
                If (((local1 = $00) And (500.0 > entitydistancesquared(XZ0260X8X2\Field74, arg0\Field52))) <> 0) Then
                    If (local2\Field3\Field45 > $00) Then
                        TZ8Z82X06D((((local2\Field3\Field25 + "shoot") + (Str rand($00, (local2\Field3\Field45 - $01)))) + ".ogg"), arg0\Field52, 22.0, 0.9, $00, $00)
                    Else
                        TZ8Z82X06D(local2\Field3\Field25, arg0\Field52, 22.0, 0.9, $00, $00)
                    EndIf
                    If (local5 <> $00) Then
                        local10 = createparticle($01, entityx(local5, $01, 1.0), entityy(local5, $01, 1.0), entityz(local5, $01, 1.0), rnd(0.008, 0.01), -0.03, 80.0)
                        rotateentity(local10\Field10, (entitypitch(arg0\Field50, $00, 1.0) + rnd(-20.0, 20.0)), (entityyaw(arg0\Field50, $00, 1.0) + rnd(-30.0, 30.0)), 0.0, $01)
                        local10\Field11 = rnd(0.001, 0.002)
                        local10\Field7 = 0.001
                        local10\Field13 = 0.4
                        local10\Field5 = -0.015
                    EndIf
                EndIf
                local11 = rndseed()
                seedrnd((arg0\Field44\Field7 + $80))
                local12 = (1.0 - ((Float (arg0\Field44\Field9 Lor arg0\Field37)) * 0.8))
                If (local2\Field3\Field60 > $00) Then
                    local12 = 1.0
                EndIf
                local15 = 900.0
                If (A6F66Z402(arg0) <> 0) Then
                    local15 = 6400.0
                EndIf
                If (local2\Field0 <> $00) Then
                    local15 = (local15 + 100000.0)
                EndIf
                If ((TXB2BFFFFFX() Lor (local15 > entitydistancesquared(XZ0260X8X2\Field74, arg0\Field52))) <> 0) Then
                    If (local2\Field0 <> $00) Then
                        TDBDBZ6FFD(arg0, local2\Field3\Field30, local2\Field3\Field58, local2\Field3\Field36, local2\Field3\Field49, local2\Field3\Field14, local2\Field3\Field4, local2\Field3\Field29, local2\Field3\Field44, local2\Field3\Field7, local2\Field3\Field23, local2\Field3\Field55, local2\Field3\Field33, local2\Field3\Field3, local2\Field3\Field0, (arg0\Field44\Field7 + $01), $00)
                    Else
                        For local17 = $01 To (local2\Field3\Field60 + $01) Step $01
                            local13 = (rnd((- local2\Field3\Field18), local2\Field3\Field18) * local12)
                            local14 = (rnd((- local2\Field3\Field18), local2\Field3\Field18) * local12)
                            local16 = TZXXF4882Z(arg0, rnd((local2\Field3\Field58 - 0.1), (local2\Field3\Field58 + 0.1)), local13, local14, local2\Field3)
                        Next
                        If (((local2\Field3\Field60 < $01) And (local5 <> $00)) <> 0) Then
                            positionentity(arg0\Field44\Field4[$00], entityx(local5, $01, 1.0), entityy(local5, $01, 1.0), entityz(local5, $01, 1.0), $01)
                            rotateentity(arg0\Field44\Field4[$00], (entitypitch(arg0\Field50, $01, 1.0) + local13), (entityyaw(arg0\Field50, $01, 1.0) + local14), 0.0, $00)
                            entityalpha(arg0\Field44\Field4[$00], 1.0)
                            If (0.0 >= getentityalpha(arg0\Field44\Field4[$01])) Then
                                positionentity(arg0\Field44\Field4[$01], entityx(local5, $01, 1.0), entityy(local5, $01, 1.0), entityz(local5, $01, 1.0), $01)
                                rotateentity(arg0\Field44\Field4[$01], (entitypitch(arg0\Field50, $01, 1.0) + local13), (entityyaw(arg0\Field50, $01, 1.0) + local14), 0.0, $00)
                                entityalpha(arg0\Field44\Field4[$01], 1.0)
                            EndIf
                            If (local16 <> $00) Then
                                nameentity(arg0\Field44\Field4[$00], (((((Str pickedx()) + " ") + (Str pickedy())) + " ") + (Str pickedz())))
                                nameentity(arg0\Field44\Field4[$01], (((((Str pickedx()) + " ") + (Str pickedy())) + " ") + (Str pickedz())))
                            Else
                                nameentity(arg0\Field44\Field4[$00], "")
                                nameentity(arg0\Field44\Field4[$01], "")
                            EndIf
                        EndIf
                    EndIf
                EndIf
                If (local2\Field3\Field15 <> $00) Then
                    YX40Z4FDFZ(arg0, local2\Field3\Field15, $03, $01)
                EndIf
                seedrnd(local11)
                arg0\Field44\Field6 = local2\Field3\Field32
                arg0\Field44\Field7 = (arg0\Field44\Field7 + $01)
                arg0\Field44\Field5 = 3.0
                arg0\Field44\Field10 = rnd(-180.0, 180.0)
                arg0\Field44\Field2 = 70.0
                If (local7 <> Null) Then
                    local7\Field15 = (local7\Field15 - 1.0)
                    If ((local2\Field3\Field42 And (0.0 = local7\Field15)) <> 0) Then
                        removeitem(local7, $01)
                    EndIf
                EndIf
            EndIf
        EndIf
        If (local5 <> $00) Then
            local18 = getchild(local5, $01)
            If (local18 = $00) Then
                local18 = copyentity(DZ64X028\Field41, $00)
                entityparent(local18, local5, $01)
                scaleentity(local18, 1.0, 1.0, 1.0, $00)
                positionentity(local18, 0.0, 0.0, 0.0, $00)
                rotateentity(local18, 0.0, 0.0, 0.0, $00)
                entityalpha(local18, 0.8)
            EndIf
            If (0.0 = arg0\Field44\Field5) Then
                If (entityhidden(local5) = $00) Then
                    hideentity(local5)
                EndIf
            Else
                If (entityhidden(local5) <> 0) Then
                    showentity(local5)
                EndIf
                rotateentity(local18, 0.0, 0.0, arg0\Field44\Field10, $00)
            EndIf
        EndIf
        arg0\Field44\Field5 = max((arg0\Field44\Field5 - fps\Field3[$00]), 0.0)
        arg0\Field44\Field6 = max((arg0\Field44\Field6 - fps\Field3[$00]), 0.0)
        arg0\Field44\Field2 = max((arg0\Field44\Field2 - fps\Field3[$00]), 0.0)
        If (local1 <> 0) Then
            TXF66Z4DBXZ((0.0 < arg0\Field44\Field5))
        EndIf
        If (((local5 <> $00) And (entityhidden(local5) = $00)) <> 0) Then
            If (arg0\Field44\Field0 = $00) Then
                arg0\Field44\Field0 = CreateLight($02, $00)
                LightRange(arg0\Field44\Field0, 4.0)
                LightColor(arg0\Field44\Field0, $132, $D8, $00)
                TX2026B22F(arg0\Field44\Field0, (opt\Field76 = $04))
            EndIf
            positionentity(arg0\Field44\Field0, entityx(local5, $01, 1.0), entityy(local5, $01, 1.0), entityz(local5, $01, 1.0), $01)
        Else
            TZ84426XFB(arg0)
        EndIf
        Return $00
    ElseIf (TXB2BFFFFFX() = $00) Then
        arg0\Field44\Field7 = arg0\Field29
    EndIf
    If ((((TXB2BFFFFFX() = $00) And (0.0 = arg0\Field44\Field2)) Lor (arg0\Field4 = $00)) <> 0) Then
        arg0\Field44\Field7 = arg0\Field29
    EndIf
    TZ84426XFB(arg0)
    arg0\Field44\Field1 = Null
    Return $00
End Function
