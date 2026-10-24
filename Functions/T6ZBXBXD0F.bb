Function T6ZBXBXD0F%()
    Local local0%
    Local local1#
    Local local2%
    Local local3.rooms
    Local local4.doors
    Local local5%
    Local local6%
    Local local7%
    Local local8.rooms
    Local local9.doors
    Local local10%
    local0 = blitz_F24F084XB0(XZ0260X8X2\Field74, playerroom\Field31)
    local1 = entityy(XZ0260X8X2\Field74, $01, 1.0)
    XX6Z868ZB0 = $00
    TZX0FF4FB0(playerroom)
    For local2 = $00 To $03 Step $01
        local3 = playerroom\Field29[local2]
        local4 = playerroom\Field10[local2]
        If (((local3 <> Null) And ((local4 = Null) Lor ((((0.0 < local4\Field13) And (entityinview(local4\Field51, camera) Lor (local0 = $00))) And (-8.0 < local1)) And (8.0 > local1)))) <> 0) Then
            TZX0FF4FB0(local3)
            local5 = (Int (local3\Field40 - playerroom\Field40))
            local6 = (Int (local3\Field3 - playerroom\Field3))
            For local7 = $00 To $03 Step $01
                local8 = local3\Field29[local7]
                local9 = local3\Field10[local7]
                If (((local8 <> Null) And (local8 <> playerroom)) <> 0) Then
                    If (((isequal(local8\Field40, (local3\Field40 + (Float local5)), 0.001) And isequal(local8\Field3, (local3\Field3 + (Float local6)), 0.001)) Lor local3\Field22\Field8) <> 0) Then
                        If (((local9 = Null) Lor ((0.0 < local9\Field13) And entityinview(local9\Field51, camera))) <> 0) Then
                            TZX0FF4FB0(local8)
                        EndIf
                    EndIf
                EndIf
            Next
        EndIf
    Next
    local10 = T26BDZFX8B(playerroom)
    For local2 = $00 To (local10 - $01) Step $01
        If (X22F66402D(X8ZBZ6X4BB[local2]) = $00) Then
            If (hideroomscoll(X8ZBZ6X4BB[local2]) <> 0) Then
                BXZDBZ0BB\Field3 = 0.0
                BXZDBZ0BB\Field1 = 8.0
            EndIf
            T20D0FZBF4B(X8ZBZ6X4BB[local2])
        EndIf
    Next
    For local2 = $00 To (local10 - $01) Step $01
        If (X22F66402D(X8ZBZ6X4BB[local2]) <> 0) Then
            If (showroomscoll(X8ZBZ6X4BB[local2]) <> 0) Then
                BXZDBZ0BB\Field3 = 0.0
                BXZDBZ0BB\Field1 = 8.0
            EndIf
            FFZ262644(X8ZBZ6X4BB[local2])
        EndIf
    Next
    showroomsnocoll(playerroom)
    showroomscoll(playerroom)
    FFZ262644(playerroom)
    Return $00
End Function
