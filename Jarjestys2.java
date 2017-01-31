
platform = {}
player = {}

function love.load()
	-- Comment
	platform.width = love.graphics.getWidth()
	platform.height = love.graphics.getHeight()

	platform.x = 0
	platform.y = platform.height / 2

	player.x = love.graphics.getWidth() / 2
	player.y = love.graphics.getHeight() / 2

	player.img = love.graphics.newImage('Guy.png')
end

function love.update(dt)

end

function love.draw()
	love.graphics.setColor(50, 50, 255)
	
	love.graphics.rectangle('fill', platform.x, platform.y, platform.width, platform.height)

	love.graphics.draw(player.img, player.x, player.y, 0, 1, 1, 0, 32)
end



