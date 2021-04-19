<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<!-- Brand -->
	<a class="navbar-brand" href="#">DhruvTylor</a>

	<!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link" href="register">Register</a>
		</li>

		<c:if test="${sessionScope.userId == null}">
			<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
		</c:if>


		<c:if test="${sessionScope.userId != null}">
			<a class="nav-link" href="logout">Logout</a>
		</c:if>

		<!-- Dropdown -->
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Other </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div></li>
	</ul>
</nav>