Function GUESSEDcreateentity_2%()
    Local local0%
    Local local1.X0442B862F
    Local local2#
    If (DZ64X028\Field18 <> Null) Then
        If (((((DZ64X028\Field61 <> Null) And (DZ64X028\Field18\Field1 <> $00)) And (1.0 > DZ64X028\Field61\Field15)) And (DZ64X028\Field46 <> $05)) <> 0) Then
            positionentity(DZ64X028\Field18\Field1, -99990.0, -99990.0, -99990.0, $01)
        EndIf
        If (DZ64X028\Field50 <> $00) Then
            If (entityhidden(DZ64X028\Field65) <> 0) Then
                showentity(DZ64X028\Field65)
            EndIf
            local0 = DZ64X028\Field18\Field4
            local1 = DZ64X028\Field18\Field3
            local2 = (local1\Field13 * DZ64X028\Field59)
            positionentity(DZ64X028\Field65, (entityx(DZ64X028\Field50, $01, 1.0) + entityx(camera, $00, 1.0)), (entityy(DZ64X028\Field50, $01, 1.0) + entityy(camera, $00, 1.0)), (entityz(DZ64X028\Field50, $01, 1.0) + entityz(camera, $00, 1.0)), $01)
            rotateentity(DZ64X028\Field65, entitypitch(local0, $00, 1.0), (entityyaw(local0, $00, 1.0) + local1\Field24), (entityroll(local0, $00, 1.0) + DZ64X028\Field35), $01)
            scaleentity(DZ64X028\Field65, local2, local2, local2, $01)
            If (0.0 = DZ64X028\Field58) Then
                entityalpha(DZ64X028\Field65, 0.0)
            Else
                entityalpha(DZ64X028\Field65, 1.0)
            EndIf
            DZ64X028\Field58 = max((DZ64X028\Field58 - fps\Field3[$00]), 0.0)
        ElseIf (entityhidden(DZ64X028\Field65) = $00) Then
            entityalpha(DZ64X028\Field65, 0.0)
            hideentity(DZ64X028\Field65)
        EndIf
    ElseIf (entityhidden(DZ64X028\Field65) = $00) Then
        entityalpha(DZ64X028\Field65, 0.0)
        hideentity(DZ64X028\Field65)
    EndIf
    If (0.0 < getentityalpha(DZ64X028\Field65)) Then
        If (DZ64X028\Field28 = $00) Then
            DZ64X028\Field28 = CreateLight($02, $00)
            LightRange(DZ64X028\Field28, 4.0)
            LightColor(DZ64X028\Field28, $132, $D8, $00)
            GUESSEDcreatenpc_3(DZ64X028\Field28, $00)
            entityparent(DZ64X028\Field28, camera, $00)
            moveentity(DZ64X028\Field28, -0.03, 0.0, 0.0, $01)
            entityparent(DZ64X028\Field28, DZ64X028\Field65, $01)
        EndIf
    ElseIf (DZ64X028\Field28 <> $00) Then
        freeentity(DZ64X028\Field28)
        DZ64X028\Field28 = $00
    EndIf
    Return $00
End Function
