Function updateitems%()
    Local local0.items
    Local local1#
    Local local2.rooms
    Local local3%
    Local local4%
    Local local5#
    Local local6#
    Local local7#
    Local local8.TX2BF6X0FF4
    Local local10#
    catcherrors("UpdateItems()")
    local1 = 230.0
    BXZDBZ0BB\Field0 = (BXZDBZ0BB\Field0 - fps\Field3[$00])
    If (0.0 >= BXZDBZ0BB\Field0) Then
        For local0 = Each items
            If (local0\Field17 = $00) Then
                local0\Field10 = Null
                For local2 = Each rooms
                    If (IsEntityInRoom(local2, local0\Field9, $00) <> 0) Then
                        local0\Field10 = local2
                        Exit
                    EndIf
                Next
                local0\Field44 = entitydistancesquared(camera, local0\Field9)
                If ((((local0\Field10 = Null) And ((local1 > local0\Field44) Lor GUESSEDupdateitems(local0))) Lor ((local0\Field10 <> Null) And (entityhidden(local0\Field10\Field15) = $00))) <> 0) Then
                    If (entityhidden(local0\Field9) <> 0) Then
                        showentity(local0\Field9)
                        entityfreeze(local0\Field9, $01)
                        entityactivate(local0\Field9, $00)
                        local0\Field11 = 0.0
                        local0\Field28 = $01
                    EndIf
                    If ((((local0\Field10 = Null) And (local1 > local0\Field44)) Lor ((local0\Field10 <> Null) And GUESSEDupdatedecals(local0\Field10, playerroom))) <> 0) Then
                        entityalpha(local0\Field5, 1.0)
                    Else
                        entityalpha(local0\Field5, 0.0)
                    EndIf
                ElseIf (entityhidden(local0\Field9) = $00) Then
                    local0\Field11 = 0.0
                    hideentity(local0\Field9)
                    entityfreeze(local0\Field9, $01)
                    entityactivate(local0\Field9, $00)
                    local0\Field28 = $00
                EndIf
            EndIf
            GUESSEDsetupdateitems(local0)
        Next
        BXZDBZ0BB\Field0 = 35.0
    EndIf
    local3 = GUESSEDupdateitems_2()
    closestitem = Null
    For local0 = Each items
        local0\Field30 = $00
        If ((local0\Field28 And (local0\Field17 = $00)) <> 0) Then
            If (((local0\Field10 <> Null) And entityhidden(local0\Field10\Field15)) <> 0) Then
                entityfreeze(local0\Field9, $01)
                local0\Field11 = 35.0
            EndIf
            local0\Field11 = (local0\Field11 - fps\Field3[$00])
            If ((((1.44 > local0\Field44) And ((closestitem = Null) Lor (entitydistancesquared(camera, closestitem\Field9) > local0\Field44))) And entityinview(local0\Field5, camera)) <> 0) Then
                entitypickmode(local0\Field9, $01, $01)
                If (entitypick(camera, 1.0) = local0\Field9) Then
                    closestitem = local0
                EndIf
                entitypickmode(local0\Field9, $00, $01)
            EndIf
            If (0.0 >= local0\Field11) Then
                If (((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) And entityisfreezed(local0\Field9)) <> 0) Then
                    If (linepick(entityx(local0\Field9, $00, 1.0), entityy(local0\Field9, $00, 1.0), entityz(local0\Field9, $00, 1.0), 0.0, -15.0, 0.0, 0.0) <> 0) Then
                        entityactivate(local0\Field9, $01)
                        entityfreeze(local0\Field9, $00)
                    Else
                        entityfreeze(local0\Field9, $01)
                        entityactivate(local0\Field9, $00)
                    EndIf
                EndIf
                local0\Field11 = 35.0
            EndIf
            If ((((local0\Field6\Field12 <> "") And (local0\Field34 < local3)) And entityisactive(local0\Field9)) <> 0) Then
                For local4 = $01 To countcollisions(local0\Field9) Step $01
                    local5 = collisionimpulse(local0\Field9, local4)
                    local6 = (local5 / local0\Field6\Field7\Field0)
                    If (0.1 < local6) Then
                        local7 = clamp((local6 / 2.0), 0.1, 1.0)
                        GUESSEDupdateentity_4(local0\Field6\Field12, blitz_TB8D046D4X0(collisionx(local0\Field9, local4), collisiony(local0\Field9, local4), collisionz(local0\Field9, local4)), 8.0, (1.2 * local7), $00, $00)
                        local0\Field34 = (local3 + $FA)
                        Exit
                    EndIf
                Next
            EndIf
        EndIf
        GUESSEDfreeentity_5(local0)
    Next
    local8 = TXXF6F02DB2[GUESSEDupdatedropitem()]
    If (local8 <> Null) Then
        If (local8\Field55\Field5 <> Null) Then
            If (local8\Field55\Field5\Field55 <> 0) Then
                closestitem = Null
            EndIf
        EndIf
    EndIf
    If (((invopen = $00) And (otheropen = Null)) <> 0) Then
        If (closestitem <> Null) Then
            Select closestitem\Field6\Field9
                Case $25
                    local10 = rnd(0.038, 0.042)
                    scalesprite(closestitem\Field12, local10, local10)
                Case $21
                    If ((((i_714\Field0 <> $02) And (T8660BZ460\Field10 <> $04)) And (T8660BZ460\Field3 <> $04)) <> 0) Then
                        XZ0260X8X2\Field64 = (800.0 - ((Float ((i_714\Field0 = $01) Lor (T8660BZ460\Field10 <> $00))) * 200.0))
                        XZ0260X8X2\Field1 = (1.0 - ((Float ((i_714\Field0 = $01) Lor (T8660BZ460\Field10 <> $00))) * 0.5))
                        i_1123\Field1 = loopsoundlocal(i_1123\Field0, i_1123\Field1, 1.0, $00)
                    EndIf
            End Select
            If (XZ0260X8X2\Field3 <> 0) Then
                pickitem(closestitem, $01)
            EndIf
        EndIf
    EndIf
    catcherrors("Uncaught: UpdateItems()")
    Return $00
End Function
