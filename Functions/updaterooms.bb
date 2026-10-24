Function updaterooms%()
    Local local0%
    Local local1%
    Local local2%
    Local local3.rooms
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    Local local9#
    Local local10%
    Local local11%
    Local local12%
    catcherrors("UpdateRooms()")
    local4 = entityx(XZ0260X8X2\Field74, $01, 1.0)
    local5 = entityy(XZ0260X8X2\Field74, $01, 1.0)
    local6 = entityz(XZ0260X8X2\Field74, $01, 1.0)
    local7 = (i_zone\Field1[$00] - (selectedcustommap = Null))
    local8 = (i_zone\Field1[$01] - (selectedcustommap = Null))
    local9 = (local6 / 8.0)
    XZ0260X8X2\Field10 = $00
    If ((Float local8) > local9) Then
        XZ0260X8X2\Field10 = $02
    ElseIf ((((Float local8) <= local9) And ((Float local7) > local9)) <> 0) Then
        XZ0260X8X2\Field10 = $01
    EndIf
    BXZDBZ0BB\Field4 = (BXZDBZ0BB\Field4 - fps\Field3[$00])
    If (0.0 >= BXZDBZ0BB\Field4) Then
        For local3 = Each rooms
            local3\Field39 = max((Abs (local3\Field40 - local4)), (Abs (local3\Field37 - local6)))
            If (blitz_F24F084XB0(XZ0260X8X2\Field74, local3\Field31) <> 0) Then
                playerroom = local3
            EndIf
            local11 = $01
            If (((local3 = playerroom) Lor isroomadjacent(playerroom, local3)) <> 0) Then
                local11 = $00
            EndIf
            For local1 = $00 To $03 Step $01
                If (isroomadjacent(playerroom\Field29[local1], local3) <> 0) Then
                    local11 = $00
                    Exit
                EndIf
            Next
            If (local11 <> 0) Then
                hideroomsnocoll(local3)
            Else
                showroomsnocoll(local3)
            EndIf
        Next
        BXZDBZ0BB\Field4 = 17.5
    EndIf
    B240DB4F()
    local12 = (Int (floor((entityx(playerroom\Field15, $00, 1.0) / 8.0)) + (floor((entityz(playerroom\Field15, $00, 1.0) / 8.0)) * (Float X824BX6D68))))
    If (((local12 >= $00) And (local12 <= $1C)) <> 0) Then
        currmapgrid\Field0[local12] = $01
    EndIf
    playerroom\Field7 = $01
    showroomsnocoll(playerroom)
    showroomscoll(playerroom)
    FFZ262644(playerroom)
    T2026X80F28()
    catcherrors("Uncaught: UpdateRooms()")
    Return $00
End Function
