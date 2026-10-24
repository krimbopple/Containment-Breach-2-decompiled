Function XXDDBX88Z8%()
    Local local0.rooms
    Local local1%
    Local local2#
    For local0 = Each rooms
        If (local0\Field22\Field21 = $03) Then
            local1 = rndseed()
            seedrnd(millisecs())
            local2 = 0.0
            Select rand($00, $0F)
                Case $00
                    tformpoint(-5306.0, 470.0, 9366.3, local0\Field15, $00)
                    local2 = -90.0
                Case $01
                    tformpoint(-5306.0, 470.0, 8839.3, local0\Field15, $00)
                    local2 = -90.0
                Case $02
                    tformpoint(-5306.0, 470.0, 8333.9, local0\Field15, $00)
                    local2 = -90.0
                Case $03
                    tformpoint(-5306.0, 470.0, 7817.3, local0\Field15, $00)
                    local2 = -90.0
                Case $04
                    tformpoint(-5306.0, 470.0, 7312.3, local0\Field15, $00)
                    local2 = -90.0
                Case $05
                    tformpoint(-5306.0, 470.0, 6043.3, local0\Field15, $00)
                    local2 = -90.0
                Case $06
                    tformpoint(-5306.0, 470.0, 5516.3, local0\Field15, $00)
                    local2 = -90.0
                Case $07
                    tformpoint(-5306.0, 470.0, 5011.1, local0\Field15, $00)
                    local2 = -90.0
                Case $08
                    tformpoint(-3966.0, 470.0, 9366.3, local0\Field15, $00)
                    local2 = 90.0
                Case $09
                    tformpoint(-3966.0, 470.0, 8839.3, local0\Field15, $00)
                    local2 = 90.0
                Case $0A
                    tformpoint(-3966.0, 470.0, 8333.9, local0\Field15, $00)
                    local2 = 90.0
                Case $0B
                    tformpoint(-3966.0, 470.0, 7817.3, local0\Field15, $00)
                    local2 = 90.0
                Case $0C
                    tformpoint(-3966.0, 470.0, 7312.3, local0\Field15, $00)
                    local2 = 90.0
                Case $0D
                    tformpoint(-3966.0, 470.0, 6043.3, local0\Field15, $00)
                    local2 = 90.0
                Case $0E
                    tformpoint(-3966.0, 470.0, 5516.3, local0\Field15, $00)
                    local2 = 90.0
                Case $0F
                    tformpoint(-3966.0, 470.0, 5011.1, local0\Field15, $00)
                    local2 = 90.0
            End Select
            seedrnd(local1)
            positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $00)
            rotateentity(XZ0260X8X2\Field74, 0.0, local2, 0.0, $00)
            resetentity(XZ0260X8X2\Field74)
            playerroom = local0
            Exit
        EndIf
    Next
    Return $00
End Function
