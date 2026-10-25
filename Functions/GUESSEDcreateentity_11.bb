Function GUESSEDcreateentity_11%(arg0.TX2BF6X0FF4)
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
    If (arg0\Field13 = GUESSEDupdatedropitem()) Then
        Return $00
    EndIf
    local0 = GUESSEDgetarg0_3(arg0, $05)
    local1 = $00
    GUESSEDscaleentity_5(arg0\Field44\Field4[$00], 1.75, 0.01)
    GUESSEDscaleentity_5(arg0\Field44\Field4[$01], 1.75, 0.065)
    If (GUESSEDcheckvalue_11(arg0, $06) <> $00) Then
        If (((FD020X0BZ\Field11 = arg0) And (FD020X0BZ\Field8 = $01)) <> 0) Then
            local2 = GUESSEDrenderrendergui_4(GUESSEDcheckvalue_8(GUESSEDcheckvalue_6(arg0, $06)))
            If (local2 = Null) Then
                Return $00
            EndIf
            If (((GUESSEDgetglobal_13() <> Null) And (GUESSEDgetglobal_13() <> arg0)) <> 0) Then
                GUESSEDfindchild(Null, Null, $00)
            EndIf
            local3 = ((GUESSEDsetanimating(arg0, $FFFFFFFF, $10) Lor GUESSEDsetanimating(arg0, $FFFFFFFF, $0B)) Lor (arg0\Field20 = $02))
            local4 = ((GUESSEDsetanimating(arg0, $FFFFFFFF, $11) Lor GUESSEDsetanimating(arg0, $FFFFFFFF, $0C)) Lor (arg0\Field20 = $03))
            GUESSEDfindchild(local2, Null, $00)
            GUESSEDsetglobal_11((arg0\Field55\Field16 + $01))
            GUESSEDsetglobal_23(arg0\Field44\Field9)
            GUESSEDsetglobal_7(local3)
            GUESSEDcheckvalue_5(local4)
            GUESSEDsetglobal_21(arg0\Field37)
            GUESSEDsetglobal(arg0)
            GUESSEDsetglobal_15((local2\Field3\Field26 And ((arg0\Field20 = $0F) Lor (arg0\Field20 = $11))))
        EndIf
        Return $00
    EndIf
    If (local0 <> $00) Then
        If (arg0\Field44\Field1 <> Null) Then
            arg0\Field44\Field3 = (arg0\Field44\Field3 - fps\Field3[$00])
            If (0.0 >= arg0\Field44\Field3) Then
                If (arg0\Field44\Field1\Field29 = arg0\Field13) Then
                    GUESSEDsetfield_19(arg0\Field44\Field1)
                EndIf
                arg0\Field44\Field1 = Null
            EndIf
            GUESSEDfreeentity_3(arg0)
            Return $00
        EndIf
        local6 = GUESSEDcheckvalue_11(arg0, $05)
        local2 = GUESSEDrenderrendergui_4(local0)
        If (local2 = Null) Then
            Return $00
        EndIf
        If (((local6 <> $00) And (countchildren(local6) > $00)) <> 0) Then
            local5 = getchild(local6, $01)
        EndIf
        If (((FD020X0BZ\Field11 = arg0) And (FD020X0BZ\Field8 = $01)) <> 0) Then
            If (((GUESSEDgetglobal_13() <> Null) And (GUESSEDgetglobal_13() <> arg0)) <> 0) Then
                GUESSEDfindchild(Null, Null, $00)
            EndIf
            local3 = ((GUESSEDsetanimating(arg0, $FFFFFFFF, $10) Lor GUESSEDsetanimating(arg0, $FFFFFFFF, $0B)) Lor (arg0\Field20 = $02))
            local4 = ((GUESSEDsetanimating(arg0, $FFFFFFFF, $11) Lor GUESSEDsetanimating(arg0, $FFFFFFFF, $0C)) Lor (arg0\Field20 = $03))
            GUESSEDfindchild(local2, Null, $00)
            GUESSEDsetglobal_11((arg0\Field55\Field16 + $01))
            GUESSEDsetglobal_23(arg0\Field44\Field9)
            GUESSEDsetglobal_7(local3)
            GUESSEDcheckvalue_5(local4)
            GUESSEDsetglobal_21(arg0\Field37)
            GUESSEDsetglobal(arg0)
            local1 = $01
        EndIf
        If (((local2\Field3\Field26 = $00) And (arg0\Field29 > arg0\Field44\Field7)) <> 0) Then
            local7 = GUESSEDgetitems(arg0, $05)
            If (((0.0 = arg0\Field44\Field6) And ((local7 = Null) Lor (0.0 < local7\Field15))) <> 0) Then
                If (GUESSEDupdateanimatenpc() <> 0) Then
                    local8 = (Int min((((Float arg0\Field39) / 1.6) / 16.0), 17.0))
                    For local9 = Each TX2BF6X0FF4
                        GUESSEDpositiondeque(local9, local8)
                    Next
                EndIf
                GUESSEDpositionentity_11(arg0)
                If (((local1 = $00) And (500.0 > entitydistancesquared(XZ0260X8X2\Field74, arg0\Field52))) <> 0) Then
                    If (local2\Field3\Field45 > $00) Then
                        GUESSEDupdateentity_4((((local2\Field3\Field25 + "shoot") + (Str rand($00, (local2\Field3\Field45 - $01)))) + ".ogg"), arg0\Field52, 22.0, 0.9, $00, $00)
                    Else
                        GUESSEDupdateentity_4(local2\Field3\Field25, arg0\Field52, 22.0, 0.9, $00, $00)
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
                If (GUESSEDcheckvalue_2(arg0) <> 0) Then
                    local15 = 6400.0
                EndIf
                If (local2\Field0 <> $00) Then
                    local15 = (local15 + 100000.0)
                EndIf
                If ((GUESSEDupdateanimatenpc() Lor (local15 > entitydistancesquared(XZ0260X8X2\Field74, arg0\Field52))) <> 0) Then
                    If (local2\Field0 <> $00) Then
                        GUESSEDscaleentity_2(arg0, local2\Field3\Field30, local2\Field3\Field58, local2\Field3\Field36, local2\Field3\Field49, local2\Field3\Field14, local2\Field3\Field4, local2\Field3\Field29, local2\Field3\Field44, local2\Field3\Field7, local2\Field3\Field23, local2\Field3\Field55, local2\Field3\Field33, local2\Field3\Field3, local2\Field3\Field0, (arg0\Field44\Field7 + $01), $00)
                    Else
                        For local17 = $01 To (local2\Field3\Field60 + $01) Step $01
                            local13 = (rnd((- local2\Field3\Field18), local2\Field3\Field18) * local12)
                            local14 = (rnd((- local2\Field3\Field18), local2\Field3\Field18) * local12)
                            local16 = GUESSEDgetentity_7(arg0, rnd((local2\Field3\Field58 - 0.1), (local2\Field3\Field58 + 0.1)), local13, local14, local2\Field3)
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
                    GUESSEDanimateanimating(arg0, local2\Field3\Field15, $03, $01)
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
            GUESSEDsetglobal_15((0.0 < arg0\Field44\Field5))
        EndIf
        If (((local5 <> $00) And (entityhidden(local5) = $00)) <> 0) Then
            If (arg0\Field44\Field0 = $00) Then
                arg0\Field44\Field0 = CreateLight($02, $00)
                LightRange(arg0\Field44\Field0, 4.0)
                LightColor(arg0\Field44\Field0, $132, $D8, $00)
                GUESSEDcreatenpc_3(arg0\Field44\Field0, (opt\Field76 = $04))
            EndIf
            positionentity(arg0\Field44\Field0, entityx(local5, $01, 1.0), entityy(local5, $01, 1.0), entityz(local5, $01, 1.0), $01)
        Else
            GUESSEDfreeentity_3(arg0)
        EndIf
        Return $00
    ElseIf (GUESSEDupdateanimatenpc() = $00) Then
        arg0\Field44\Field7 = arg0\Field29
    EndIf
    If ((((GUESSEDupdateanimatenpc() = $00) And (0.0 = arg0\Field44\Field2)) Lor (arg0\Field4 = $00)) <> 0) Then
        arg0\Field44\Field7 = arg0\Field29
    EndIf
    GUESSEDfreeentity_3(arg0)
    arg0\Field44\Field1 = Null
    Return $00
End Function
