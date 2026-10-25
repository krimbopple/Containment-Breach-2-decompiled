Function updatemtf%()
    Local local0.rooms
    Local local1.npcs
    Local local2%
    Local local3.rooms
    Local local4%
    If (((playerroom\Field22\Field21 = $4B) Lor ((GUESSEDupdatexdb() <> $00) And (GUESSEDupdateanimatenpc() = $00))) <> 0) Then
        Return $00
    EndIf
    If (0.0 = mtftimer) Then
        If (((rand($C8, $01) = $01) And (playerroom\Field22\Field21 <> $70)) <> 0) Then
            local3 = Null
            For local0 = Each rooms
                If (local0\Field22\Field21 = $4B) Then
                    local3 = local0
                    Exit
                EndIf
            Next
            If (((((0.0 = XZ0260X8X2\Field48) And (local3 <> Null)) And (XZ0260X8X2\Field10 = $02)) And (infacility <> $FFFFFFFF)) <> 0) Then
                n_i\Field2\Field57 = ((Float selecteddifficulty\Field2) + 1.0)
                playannouncement("SFX\Character\MTF\AnnouncEnter.ogg", $01)
                mtftimer = fps\Field3[$00]
                For local2 = $00 To $02 Step $01
                    local1 = createnpc($18, (entityx(local3\Field35, $01, 1.0) + (0.3 * (Float (local2 - $01)))), 0.28, entityz(local3\Field35, $01, 1.0))
                    If (local2 = $00) Then
                        n_i\Field11 = local1
                        changenpctextureid(local1, $0E)
                    ElseIf (local2 = $01) Then
                        n_i\Field13 = local1
                    EndIf
                Next
            EndIf
        EndIf
    ElseIf (8400.0 >= mtftimer) Then
        mtftimer = (fps\Field3[$00] + mtftimer)
    ElseIf (((8400.0 < mtftimer) And (10000.0 > mtftimer)) <> 0) Then
        playannouncement("SFX\Character\MTF\AnnouncAfter0.ogg", $01)
        mtftimer = 10000.0
    ElseIf (((10000.0 <= mtftimer) And (18400.0 >= mtftimer)) <> 0) Then
        mtftimer = (fps\Field3[$00] + mtftimer)
    ElseIf (((18400.0 < mtftimer) And (20000.0 > mtftimer)) <> 0) Then
        playannouncement("SFX\Character\MTF\AnnouncAfter1.ogg", $01)
        mtftimer = 20000.0
    ElseIf (((20000.0 <= mtftimer) And (24200.0 >= mtftimer)) <> 0) Then
        mtftimer = (fps\Field3[$00] + mtftimer)
    ElseIf (((24200.0 < mtftimer) And (25000.0 > mtftimer)) <> 0) Then
        local4 = $00
        For local2 = $00 To (maxitemamount - $01) Step $01
            If (TX60DB8XBBZ(local2) <> Null) Then
                If ((((left(TX60DB8XBBZ(local2)\Field6\Field19, $04) = "SCP-") And (left(TX60DB8XBBZ(local2)\Field6\Field19, $07) <> "SCP-035")) And (left(TX60DB8XBBZ(local2)\Field6\Field19, $07) <> "SCP-093")) <> 0) Then
                    local4 = $01
                    Exit
                EndIf
            EndIf
        Next
        If (local4 <> 0) Then
            playannouncement("SFX\Character\MTF\AnnouncThreatPossession.ogg", $01)
        Else
            playannouncement((("SFX\Character\MTF\AnnouncThreat" + (Str rand($00, $02))) + ".ogg"), $01)
        EndIf
        mtftimer = 25000.0
    ElseIf (((25000.0 <= mtftimer) And (29200.0 >= mtftimer)) <> 0) Then
        mtftimer = (fps\Field3[$00] + mtftimer)
    ElseIf (((29200.0 < mtftimer) And (30000.0 > mtftimer)) <> 0) Then
        playannouncement("SFX\Character\MTF\AnnouncThreatFinal.ogg", $01)
        mtftimer = 30000.0
    EndIf
    Return $00
End Function
