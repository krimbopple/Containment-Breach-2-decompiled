Function loadwaypoints%(arg0%, arg1%)
    Local local0.doors
    Local local1.waypoints
    Local local2.waypoints
    Local local3.rooms
    Local local4.rooms
    Local local5#
    Local local6%
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    For local0 = Each doors
        local10 = entityx(local0\Field51, $01, 1.0)
        local11 = entityy(local0\Field51, $01, 1.0)
        local12 = entityz(local0\Field51, $01, 1.0)
        If (local0\Field41 = $00) Then
            If (local0\Field46 = $03) Then
                local0\Field11 = copyentity(d_i\Field5, $00)
            Else
                local0\Field11 = copyentity(d_i\Field7, $00)
            EndIf
            scaleentity(local0\Field11, (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
            positionentity(local0\Field11, local10, local11, local12, $01)
            rotateentity(local0\Field11, 0.0, entityyaw(local0\Field51, $01, 1.0), 0.0, $00)
            entitypickmode(local0\Field11, $02, $01)
        EndIf
        hideentity(local0\Field0)
        If (local0\Field7 <> $00) Then
            hideentity(local0\Field7)
        EndIf
        hideentity(local0\Field51)
        If (local0\Field32 = Null) Then
            local4 = Null
            local8 = 30.0
            For local3 = Each rooms
                local5 = (Abs (entityx(local3\Field15, $01, 1.0) - local10))
                If (20.0 > local5) Then
                    local7 = (Abs (entityz(local3\Field15, $01, 1.0) - local12))
                    If (20.0 > local7) Then
                        local9 = ((local5 * local5) + (local7 * local7))
                        If (local8 > local9) Then
                            local4 = local3
                            local8 = local9
                        EndIf
                    EndIf
                EndIf
            Next
        Else
            local4 = local0\Field32
        EndIf
        If (((local0\Field41 = $00) And (local0\Field46 <> $05)) <> 0) Then
            createwaypoint(local0, local4, local10, (local11 + 0.18), local12)
        EndIf
    Next
    local13 = $00
    For local1 = Each waypoints
        local13 = (local13 + $01)
    Next
    local14 = $00
    local15 = $00
    For local1 = Each waypoints
        local14 = (local14 + $01)
        local15 = (local15 + $01)
        If (local15 = $05) Then
            renderloading(min((floor(((20.0 / (Float local13)) * (Float local14))) + (Float arg0)), (Float arg1)), getlocalstring("loading", "waypoints"), $00, 0.025)
            local15 = $00
        EndIf
        For local2 = Each waypoints
            If (local2\Field9 = local1\Field9) Then
                entityradius(local2\Field0, 0.2, 0.0)
                entitypickmode(local2\Field0, $01, $01)
            EndIf
        Next
        local2 = (After local1)
        local18 = $00
        While (local2 <> Null)
            If ((((local1\Field9 = local2\Field9) Lor (local1\Field7 <> Null)) Lor (local2\Field7 <> Null)) <> 0) Then
                local8 = entitydistance(local1\Field0, local2\Field0)
                If (((0.0 = local1\Field9\Field19) Lor (0.0 = local2\Field9\Field19)) <> 0) Then
                    local18 = $01
                ElseIf (isequal(entityy(local1\Field0, $00, 1.0), entityy(local2\Field0, $00, 1.0), local1\Field9\Field19) <> 0) Then
                    local18 = $01
                EndIf
                If (((local18 And (7.0 > entitydistance(local1\Field0, local2\Field0))) And entityvisible(local1\Field0, local2\Field0, 0.0)) <> 0) Then
                    For local16 = $00 To $03 Step $01
                        If (local1\Field3[local16] = Null) Then
                            local1\Field3[local16] = local2
                            local1\Field1[local16] = local8
                            Exit
                        EndIf
                    Next
                    For local17 = $00 To $03 Step $01
                        If (local2\Field3[local17] = Null) Then
                            local2\Field3[local17] = local1
                            local2\Field1[local17] = local8
                            Exit
                        EndIf
                    Next
                EndIf
            EndIf
            local2 = (After local2)
        Wend
        For local2 = Each waypoints
            If (local2\Field9 = local1\Field9) Then
                entityradius(local2\Field0, 0.0, 0.0)
                entitypickmode(local2\Field0, $00, $01)
            EndIf
        Next
    Next
    For local0 = Each doors
        If (local0\Field41 = $00) Then
            freeentity(local0\Field11)
            local0\Field11 = $00
        EndIf
        showentity(local0\Field0)
        If (local0\Field7 <> $00) Then
            showentity(local0\Field7)
        EndIf
        showentity(local0\Field51)
    Next
    freeentity(d_i\Field7)
    d_i\Field7 = $00
    freeentity(d_i\Field5)
    d_i\Field5 = $00
    For local1 = Each waypoints
        entityradius(local1\Field0, 0.0, 0.0)
        entitypickmode(local1\Field0, $00, $00)
        If (opt\Field30 <> 0) Then
            For local16 = $00 To $03 Step $01
                If (local1\Field3[local16] <> Null) Then
                    local19 = createline(entityx(local1\Field0, $01, 1.0), entityy(local1\Field0, $01, 1.0), entityz(local1\Field0, $01, 1.0), entityx(local1\Field3[local16]\Field0, $01, 1.0), entityy(local1\Field3[local16]\Field0, $01, 1.0), entityz(local1\Field3[local16]\Field0, $01, 1.0), $00)
                    entityfx(local19, $01)
                    entitycolor(local19, 0.0, 200.0, 0.0)
                    entityparent(local19, local1\Field0, $01)
                EndIf
            Next
        EndIf
    Next
    Return $00
End Function
